package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//采购订单
@Getter
@Setter
public class OrderBill extends BaseDomain{
    public static final int STATE_NORMAL=0;//待审核
    public static final int STATE_AUDIT=1;//待审核
    private String sn;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date vdate;//业务时间
    private int status=STATE_NORMAL;//审核状态
    private BigDecimal totalAmount; //采购总金额
    private BigDecimal totalNumber; //采购总数量
    private Date inputTime;//制单时间
    private Date auditTime;//审核时间
    private Employee inputUser;//制单人
    private Employee auditor;//审核人
    private Supplier supplier;//供应商
    //一个单据对应多条明细
    private List<OrderBillItem> items=new ArrayList<>();

    public String getDisplayStatus(){
        return this.status==STATE_NORMAL ? "待审核":"已审核";
    }


}
