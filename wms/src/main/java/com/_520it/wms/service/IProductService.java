package com._520it.wms.service;

import com._520it.wms.domain.Product;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.ProductQueryObject;

import java.util.List;

/**
 * Created by John on 2017/10/13.
 */
public interface IProductService {

    void saveOrUpdate(Product product);

    void delete(Long id);

    Product get(Long id);

    List<Product> list();

    PageResult query(ProductQueryObject qo);

}
