package com._520it.wms.service;

import com._520it.wms.query.ChartQueryObject;
import com._520it.wms.query.SaleChartQueryObject;

import java.util.List;
import java.util.Map;

/**
 * Created by John on 2017/10/22.
 */
public interface IChartService {

    List<Map<String,Object>> queryOrderChart(ChartQueryObject qo);

    List<Map<String,Object>> querySaleChart(SaleChartQueryObject qo);
}
