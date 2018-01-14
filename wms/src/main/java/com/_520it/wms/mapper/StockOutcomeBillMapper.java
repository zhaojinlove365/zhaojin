package com._520it.wms.mapper;

import com._520it.wms.domain.StockOutcomeBill;
import com._520it.wms.query.QueryObject;

import java.util.List;

public interface StockOutcomeBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StockOutcomeBill bill);

    StockOutcomeBill selectByPrimaryKey(Long id);

    List<StockOutcomeBill> selectAll();

    int updateByPrimaryKey(StockOutcomeBill bill);

    int queryForCount(QueryObject qo);

    List<StockOutcomeBill> queryForList(QueryObject qo);

    void updateStates(StockOutcomeBill old);
}