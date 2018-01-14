package com._520it.wms.service;

import com._520it.wms.domain.Supplier;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;

import java.util.List;

/**
 * Created by John on 2017/10/13.
 */
public interface ISupplierService {

    void saveOrUpdate(Supplier supplier);

    void delete(Long id);

    Supplier get(Long id);

    List<Supplier> list();

    PageResult query(QueryObject qo);

}
