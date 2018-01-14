package com._520it.wms.service.impl;

import com._520it.wms.domain.*;
import com._520it.wms.mapper.ProductStockMapper;
import com._520it.wms.mapper.SaleAccountMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.ProductStockQueryObject;
import com._520it.wms.service.IProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class ProductStockServiceImpl implements IProductStockService {
    @Autowired
    private ProductStockMapper stockMapper;
    @Autowired
    private SaleAccountMapper saleAccountMapper;

    @Override
    public void stockIncome(StockIncomeBill bill) {
        //迭代每一条明细
        for (StockIncomeBillItem item : bill.getItems()) {
            ProductStock ps = stockMapper.selectByDepotIdAndProductId(bill.getDepot().getId(), item.getProduct().getId());
            if (ps == null) {//该商品在该仓库中无库存信息
                ps = new ProductStock();
                ps.setDepot(bill.getDepot());
                ps.setProduct(item.getProduct());
                ps.setPrice(item.getCostPrice());
                ps.setStoreNumber(item.getNumber());
                ps.setAmount(item.getAmount());
                stockMapper.insert(ps);
            }else{//存在库存信息
                ps.setStoreNumber(ps.getStoreNumber().add(item.getNumber()));//添加明细数量
                ps.setAmount(ps.getAmount().add(item.getAmount())); //添加明细小计
                ps.setPrice(ps.getAmount().divide(ps.getStoreNumber(),2, BigDecimal.ROUND_HALF_UP)); //计算库存价格，四舍五入，保留2位
                stockMapper.updateByPrimaryKey(ps);
            }
        }
    }

    @Override
    public void stockOutcome(StockOutcomeBill bill) {

        //迭代每一条明细
        for (StockOutcomeBillItem item : bill.getItems()) {
            ProductStock ps = stockMapper.selectByDepotIdAndProductId(bill.getDepot().getId(), item.getProduct().getId());
            if (ps == null) {//该商品在该仓库中无库存信息
                throw new RuntimeException(ps.getDepot().getName()+"仓库无库存");
            }

            if((ps.getStoreNumber()).compareTo(item.getNumber())<0){
                throw new RuntimeException(ps.getDepot().getName()+"仓库库存"+ps.getStoreNumber()+"不足"+item.getNumber());
            }
            //存在库存信息【出货时价格是固定的，不能再修改】
            ps.setStoreNumber(ps.getStoreNumber().subtract(item.getNumber()));//添加明细数量
            ps.setAmount((ps.getPrice()).multiply(ps.getStoreNumber())); //添加明细小计
            stockMapper.updateByPrimaryKey(ps);
            //记录每一笔销售账

            SaleAccount sa = new SaleAccount();
            sa.setVdate(new Date());
            sa.setNumber(item.getNumber());
            sa.setCostPrice(ps.getPrice());
            sa.setCostAmount((sa.getCostPrice()).multiply(sa.getNumber()).setScale(2,BigDecimal.ROUND_HALF_UP));
            sa.setSalePrice(item.getSalePrice());
            sa.setSaleAmount(item.getAmount());
            sa.setProduct(item.getProduct());
            sa.setSaleman(bill.getInputUser());
            sa.setClient(bill.getClient());
            saleAccountMapper.insert(sa);
        }

    }

    @Override
    public PageResult query(ProductStockQueryObject qo) {
        int count = stockMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage()
                    ,qo.getPageSize(),stockMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
