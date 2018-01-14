package com._520it.wms.mapper;

import com._520it.wms.domain.StockIncomeBillItem;

import java.util.List;

public interface StockIncomeBillItemMapper {

    int insert(StockIncomeBillItem billItem);

    List<StockIncomeBillItem> selectAll();

    List<StockIncomeBillItem> selectByStockIncomeBillId(Long stockIncomeBillId);

    void deleteByBillId(Long billId);
}