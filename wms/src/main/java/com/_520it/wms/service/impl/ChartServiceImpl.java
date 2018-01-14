package com._520it.wms.service.impl;

import com._520it.wms.mapper.ChartMapper;
import com._520it.wms.query.ChartQueryObject;
import com._520it.wms.query.SaleChartQueryObject;
import com._520it.wms.service.IChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ChartServiceImpl implements IChartService {
    @Autowired
    private ChartMapper chartMapper;
    @Override
    public List<Map<String, Object>> queryOrderChart(ChartQueryObject qo) {
        return chartMapper.queryOrderChart(qo);
    }

    @Override
    public List<Map<String, Object>> querySaleChart(SaleChartQueryObject qo) {
        return chartMapper.querySaleChart(qo);
    }
}
