package com._520it.wms.mapper;

import com._520it.wms.domain.OrderBillItem;
import java.util.List;

public interface OrderBillItemMapper {

    int insert(OrderBillItem orderBillItem);

    List<OrderBillItem> selectAll();

    void deleteByBillId(Long billId);

    List<OrderBillItem> selectByOrderBillId(Long OrderBillId);
}