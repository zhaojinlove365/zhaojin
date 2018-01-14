package com._520it.wms.service;

import com._520it.wms.domain.OrderBill;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.OrderBillQueryObject;

import java.util.List;


public interface IOrderBillService {


    void save(OrderBill orderBill);

    void update(OrderBill orderBill);

    void delete(Long id);

    OrderBill get(Long id);

    List<OrderBill> list();

    PageResult query(OrderBillQueryObject qo);

    void audit(Long id);
}
