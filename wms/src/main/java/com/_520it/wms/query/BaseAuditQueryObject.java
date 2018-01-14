package com._520it.wms.query;


import com._520it.wms.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Setter
@Getter
public class BaseAuditQueryObject extends QueryObject{


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private int status = -1;//审核状态

    public Date getEndDate() {
        return endDate != null ? DateUtil.getEndDate(endDate) : null;
    }

}
