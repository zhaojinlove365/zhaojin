package com._520it.wms.mapper;


import com._520it.wms.query.ChartQueryObject;
import com._520it.wms.query.SaleChartQueryObject;

import java.util.List;
import java.util.Map;

public interface ChartMapper {

    List<Map<String,Object>> queryOrderChart(ChartQueryObject qo);

    List<Map<String,Object>> querySaleChart(SaleChartQueryObject qo);
}
