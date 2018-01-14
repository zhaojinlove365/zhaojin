package com._520it.wms.service.impl;

import com._520it.wms.domain.StockOutcomeBill;
import com._520it.wms.domain.StockOutcomeBillItem;
import com._520it.wms.mapper.ProductStockMapper;
import com._520it.wms.mapper.StockOutcomeBillItemMapper;
import com._520it.wms.mapper.StockOutcomeBillMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.StockOutcomeBillQueryObject;
import com._520it.wms.service.IProductStockService;
import com._520it.wms.service.IStockOutcomeBillService;
import com._520it.wms.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Service
public class StockOutcomeBillServiceImpl implements IStockOutcomeBillService {
    @Autowired
    private StockOutcomeBillMapper billMapper;
    @Autowired
    private StockOutcomeBillItemMapper itemMapper;
    @Autowired
    private ProductStockMapper stockMapper;
    @Autowired
    private IProductStockService stockService;

    public void save(StockOutcomeBill bill){
        //1.设置制单人和制单时间
        bill.setInputUser(UserContext.getCurrentUser());
        bill.setInputTime(new Date());
        //2.重新设置单据的待审状态
        bill.setStatus(StockOutcomeBill.STATE_NORMAL);
        BigDecimal totalAmount=BigDecimal.ZERO;
        BigDecimal totalNumber=BigDecimal.ZERO;
        //3.迭代单据中每一条明细，去计算单据总金额和总数量
        for (StockOutcomeBillItem item : bill.getItems()) {
            BigDecimal amount = item.getSalePrice().multiply(item.getNumber()).setScale(2, BigDecimal.ROUND_HALF_UP);//明细的金额小计
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
        for (StockOutcomeBillItem item : bill.getItems()) {
            item.setBillId(bill.getId());
            itemMapper.insert(item);
        }


    }

    public void update(StockOutcomeBill bill){
            //1.判断是否处于待审核，待审核可以修改
        StockOutcomeBill old = billMapper.selectByPrimaryKey(bill.getId());
        if(old.getStatus()==StockOutcomeBill.STATE_NORMAL){
            //2.设置制单人和制单时间
            bill.setInputUser(old.getInputUser());
            bill.setInputTime(old.getInputTime());
            //3.先把该单据的所有明细删除
            itemMapper.deleteByBillId(bill.getId());
            //4.迭代单据中每条明细，计算单据总金额和总数量
            BigDecimal totalAmount=BigDecimal.ZERO;
            BigDecimal totalNumber=BigDecimal.ZERO;
            for (StockOutcomeBillItem item : bill.getItems()) {
                BigDecimal amount = item.getSalePrice().multiply(item.getNumber()).setScale(2, BigDecimal.ROUND_HALF_UP);//明细的金额小计
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
        StockOutcomeBill bill = billMapper.selectByPrimaryKey(id);
        if(bill.getStatus()== StockOutcomeBill.STATE_NORMAL){
            //2.若是，设置已审核状态，审核时间，审核人
            bill.setStatus(StockOutcomeBill.STATE_AUDIT);
            bill.setAuditor(UserContext.getCurrentUser());
            bill.setAuditTime(new Date());
            //3.更改
            billMapper.updateStates(bill);
            //出库操作
            stockService.stockOutcome(bill);


        }
    }


    @Override
    public StockOutcomeBill get(Long id) {

        return billMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<StockOutcomeBill> list() {

        return billMapper.selectAll();
    }

    @Override
    public PageResult query(StockOutcomeBillQueryObject qo) {
        int count = billMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),billMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
