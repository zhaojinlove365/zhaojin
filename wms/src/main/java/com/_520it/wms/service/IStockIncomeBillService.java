package com._520it.wms.service;

import com._520it.wms.domain.StockIncomeBill;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.StockIncomeBillQueryObject;

import java.util.List;


public interface IStockIncomeBillService {


    void save(StockIncomeBill bill);

    void update(StockIncomeBill bill);

    void delete(Long id);

    StockIncomeBill get(Long id);

    List<StockIncomeBill> list();

    PageResult query(StockIncomeBillQueryObject qo);

    void audit(Long id);
}
