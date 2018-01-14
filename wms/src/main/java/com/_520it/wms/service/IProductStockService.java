package com._520it.wms.service;


import com._520it.wms.domain.StockIncomeBill;
import com._520it.wms.domain.StockOutcomeBill;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.ProductStockQueryObject;

public interface IProductStockService {

    void stockIncome(StockIncomeBill bill);

    void stockOutcome(StockOutcomeBill bill);

    PageResult query(ProductStockQueryObject qo);

}
