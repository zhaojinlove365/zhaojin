package com._520it.wms.mapper;

import com._520it.wms.domain.Product;
import com._520it.wms.query.ProductQueryObject;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Product product);

    Product selectByPrimaryKey(Long id);

    List<Product> selectAll();

    int updateByPrimaryKey(Product product);

    int queryForCount(ProductQueryObject qo);

    List<Product> queryForList(ProductQueryObject qo);

  
}