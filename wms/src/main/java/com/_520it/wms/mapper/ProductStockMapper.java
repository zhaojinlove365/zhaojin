package com._520it.wms.mapper;

import com._520it.wms.domain.Employee;
import com._520it.wms.domain.ProductStock;
import com._520it.wms.query.EmployeeQueryObject;
import com._520it.wms.query.QueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ProductStockMapper {

    int insert(ProductStock ps);


    int updateByPrimaryKey(ProductStock ps);

    ProductStock selectByDepotIdAndProductId(@Param("depotId") Long depotId, @Param("productId") Long productId);

    int queryForCount(QueryObject qo);

    List<ProductStock> queryForList(QueryObject qo);
}