package com._520it.wms.service;

import com._520it.wms.domain.StockOutcomeBill;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.StockOutcomeBillQueryObject;

import java.util.List;


public interface IStockOutcomeBillService {


    void save(StockOutcomeBill bill);

    void update(StockOutcomeBill bill);

    void delete(Long id);

    StockOutcomeBill get(Long id);

    List<StockOutcomeBill> list();

    PageResult query(StockOutcomeBillQueryObject qo);

    void audit(Long id);
}
