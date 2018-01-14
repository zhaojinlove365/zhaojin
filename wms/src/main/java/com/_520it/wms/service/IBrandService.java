package com._520it.wms.service;

import com._520it.wms.domain.Brand;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;

import java.util.List;

/**
 * Created by John on 2017/10/13.
 */
public interface IBrandService {

    void saveOrUpdate(Brand brand);

    void delete(Long id);

    Brand get(Long id);

    List<Brand> list();

    PageResult query(QueryObject qo);

}
