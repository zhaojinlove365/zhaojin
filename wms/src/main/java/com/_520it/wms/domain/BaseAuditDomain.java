package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseAuditDomain extends BaseDomain{
    public static final int STATE_NORMAL=0;//待审核
    public static final int STATE_AUDIT=1;//待审核
    private int status=STATE_NORMAL;//审核状态
    private Date inputTime;//制单时间
    private Date auditTime;//审核时间
    private Employee inputUser;//制单人
    private Employee auditor;//审核人

    public String getDisplayStatus(){
        return this.status==STATE_NORMAL ? "待审核":"已审核";
    }

}
