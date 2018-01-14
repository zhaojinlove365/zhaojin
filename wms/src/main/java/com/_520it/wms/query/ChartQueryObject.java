package com._520it.wms.query;

import com._520it.wms.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Setter
@Getter
public class ChartQueryObject extends QueryObject {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;  //业务开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate; //业务结束时间

    private String keyword; //关键字

    private Long supplierId=-1L;
    private Long brandId=-1L;

    public Date getEndDate() {
        return endDate != null ? DateUtil.getEndDate(endDate) : null;
    }

    private String groupBy="iu.name"; //按照什么分组

    public static Map<String,String> groupByMap=new LinkedHashMap<>();

    static{
        groupByMap.put("iu.name","订货人员");
        groupByMap.put("p.name","货品名称");
        groupByMap.put("s.name","供应商");
        groupByMap.put("p.brandName","品牌名称");
        groupByMap.put("DATE_FORMAT(bill.vdate,'%Y-%m')","订单日期(月)");
        groupByMap.put("DATE_FORMAT(bill.vdate,'%Y-%m-%d')","订单日期(日)");
    }

    public String getKeywords() {
        return empty2null(keyword);
    } // 过滤关键字中的空字符串


}
