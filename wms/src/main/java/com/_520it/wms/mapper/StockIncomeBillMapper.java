package com._520it.wms.mapper;

import com._520it.wms.domain.StockIncomeBill;
import com._520it.wms.query.QueryObject;

import java.util.List;

public interface StockIncomeBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StockIncomeBill bill);

    StockIncomeBill selectByPrimaryKey(Long id);

    List<StockIncomeBill> selectAll();

    int updateByPrimaryKey(StockIncomeBill bill);

    int queryForCount(QueryObject qo);

    List<StockIncomeBill> queryForList(QueryObject qo);

    void updateStates(StockIncomeBill old);
}