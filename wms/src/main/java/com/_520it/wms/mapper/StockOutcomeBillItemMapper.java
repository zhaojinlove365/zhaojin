package com._520it.wms.mapper;

import com._520it.wms.domain.StockOutcomeBillItem;

import java.util.List;

public interface StockOutcomeBillItemMapper {

    int insert(StockOutcomeBillItem billItem);

    List<StockOutcomeBillItem> selectAll();

    List<StockOutcomeBillItem> selectByStockOutcomeBillId(Long stockOutcomeBillId);

    void deleteByBillId(Long billId);
}