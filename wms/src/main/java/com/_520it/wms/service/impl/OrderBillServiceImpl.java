package com._520it.wms.service.impl;

import com._520it.wms.domain.OrderBill;
import com._520it.wms.domain.OrderBillItem;
import com._520it.wms.mapper.OrderBillItemMapper;
import com._520it.wms.mapper.OrderBillMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.OrderBillQueryObject;
import com._520it.wms.service.IOrderBillService;
import com._520it.wms.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Service
public class OrderBillServiceImpl implements IOrderBillService {
    @Autowired
    private OrderBillMapper billMapper;
    @Autowired
    private OrderBillItemMapper itemMapper;

    public void save(OrderBill bill){
        //1.设置制单人和制单时间
        bill.setInputUser(UserContext.getCurrentUser());
        bill.setInputTime(new Date());
        //2.重新设置单据的待审状态
        bill.setStatus(OrderBill.STATE_NORMAL);
        BigDecimal totalAmount=BigDecimal.ZERO;
        BigDecimal totalNumber=BigDecimal.ZERO;
        //3.迭代单据中每一条明细，去计算单据总金额和总数量
        for (OrderBillItem item : bill.getItems()) {
            BigDecimal amount = item.getCostPrice().multiply(item.getNumber()).setScale(2, BigDecimal.ROUND_HALF_UP);//明细的金额小计
            totalAmount = totalAmount.add(amount);
            totalNumber = totalNumber.add(item.getNumber());
            //设置明细的小计
            item.setAmount(amount);
        }
        //给单据设置总金额和总数量
        bill.setTotalAmount(totalAmount);
        bill.setTotalNumber(totalNumber);
        //4.保存单据对象
        billMapper.insert(bill);
        //5.设置明细所属单据的id
        for (OrderBillItem item : bill.getItems()) {
            item.setBillId(bill.getId());
            itemMapper.insert(item);
        }


    }

    public void update(OrderBill bill){
            //1.判断是否处于待审核，待审核可以修改
        OrderBill old = billMapper.selectByPrimaryKey(bill.getId());
        if(old.getStatus()==OrderBill.STATE_NORMAL){
            //2.设置制单人和制单时间
            bill.setInputUser(old.getInputUser());
            bill.setInputTime(old.getInputTime());
            //3.先把该单据的所有明细删除
            itemMapper.deleteByBillId(bill.getId());
            //4.迭代单据中每条明细，计算单据总金额和总数量
            BigDecimal totalAmount=BigDecimal.ZERO;
            BigDecimal totalNumber=BigDecimal.ZERO;
            for (OrderBillItem item : bill.getItems()) {
                BigDecimal amount = item.getCostPrice().multiply(item.getNumber()).setScale(2, BigDecimal.ROUND_HALF_UP);//明细的金额小计
                totalAmount = totalAmount.add(amount);
                totalNumber = totalNumber.add(item.getNumber());
                //设置明细的小计
                item.setAmount(amount);
                item.setBillId(bill.getId());
                itemMapper.insert(item);
            }
            //5.给单据设置总金额和总数量
            bill.setTotalAmount(totalAmount);
            bill.setTotalNumber(totalNumber);
        }
            //6.更新单据对象
            billMapper.updateByPrimaryKey(bill);

    }





    @Override
    public void delete(Long id) {

        itemMapper.deleteByBillId(id);
        billMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void audit(Long id){
        //1.查询出单据对象，判断是哦福处于待审核状态
        OrderBill old = billMapper.selectByPrimaryKey(id);
        if(old.getStatus()== OrderBill.STATE_NORMAL){
            //2.若是，设置已审核状态，审核时间，审核人
            old.setStatus(OrderBill.STATE_AUDIT);
            old.setAuditor(UserContext.getCurrentUser());
            old.setAuditTime(new Date());
            //3.更改
            billMapper.updateStates(old);
        }
    }


    @Override
    public OrderBill get(Long id) {

        return billMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderBill> list() {

        return billMapper.selectAll();
    }

    @Override
    public PageResult query(OrderBillQueryObject qo) {
        int count = billMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),billMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
