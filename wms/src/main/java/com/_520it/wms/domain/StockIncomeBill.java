package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//采购入库订单
@Getter
@Setter
public class StockIncomeBill extends BaseAuditDomain{
    private String sn;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date vdate;//业务时间
    private BigDecimal totalAmount; //采购总金额
    private BigDecimal totalNumber; //采购总数量

    private Depot depot;//仓库
    //一个单据对应多条明细
    private List<StockIncomeBillItem> items=new ArrayList<>();




}
