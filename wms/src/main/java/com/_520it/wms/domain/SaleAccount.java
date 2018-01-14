package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class SaleAccount {
    private Long id;
    private Date vdate; //业务时间
    private BigDecimal number;
    private BigDecimal costPrice;
    private BigDecimal costAmount;
    private BigDecimal salePrice;
    private BigDecimal saleAmount;
    private Product product;
    private Employee saleman; //销售人员
    private Client client; //客户

}
