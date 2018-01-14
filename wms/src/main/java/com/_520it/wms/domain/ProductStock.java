package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductStock extends BaseDomain{
    private BigDecimal price; //货品价格
    private BigDecimal storeNumber; //库存数量
    private BigDecimal amount; //货品小计
    private Product product;
    private Depot depot;


}
