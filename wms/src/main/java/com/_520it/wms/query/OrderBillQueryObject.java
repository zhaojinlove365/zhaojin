package com._520it.wms.query;

import com._520it.wms.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by John on 2017/10/18.
 */
@Getter
@Setter
public class OrderBillQueryObject extends QueryObject{
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date beginDate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    private Long supplierId=-1L;

    private int status=-1;//审核状态


    public Date getEndDate(){
        return endDate !=null ? DateUtil.getEndDate(endDate):null;
    }


}
