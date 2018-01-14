package com._520it.wms.web.controller;


import com._520it.wms.query.ChartQueryObject;
import com._520it.wms.query.SaleChartQueryObject;
import com._520it.wms.service.IBrandService;
import com._520it.wms.service.IChartService;
import com._520it.wms.service.IClientService;
import com._520it.wms.service.ISupplierService;
import com._520it.wms.util.RequiredPermission;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/chart")
public class ChartController {
    @Autowired
    private ISupplierService supplierService;
    @Autowired
    private IBrandService brandService;
    @Autowired
    private IChartService chartService;
    @Autowired
    private IClientService clientService;

    @RequestMapping("/order")
    @RequiredPermission("订单报表")
    public String order(@ModelAttribute("qo") ChartQueryObject qo, Model model){
        model.addAttribute("result",chartService.queryOrderChart(qo));
        model.addAttribute("brands",brandService.list());
        model.addAttribute("suppliers",supplierService.list());
        model.addAttribute("groupByMap",ChartQueryObject.groupByMap);
        return "chart/order";
    }

    @RequestMapping("/sale")
    @RequiredPermission("销售报表")
    public String saleChart(@ModelAttribute("qo") SaleChartQueryObject qo, Model model){
        model.addAttribute("result",chartService.querySaleChart(qo));
        model.addAttribute("brands",brandService.list());
        model.addAttribute("clients",clientService.list());
        model.addAttribute("groupByMap", SaleChartQueryObject.groupByMap);
        return "chart/sale";
    }

    @RequestMapping("/saleChartByBar")
    public String saleChartByBar(@ModelAttribute("qo") SaleChartQueryObject qo, Model model){
        List<Map<String, Object>> list = chartService.querySaleChart(qo);
        List<Object> groupByList = new ArrayList<>(); //封装分组条件，横坐标
        List<Object> totalAmountList = new ArrayList<>(); //封装分组条件，横坐标
        for (Map<String,Object> map : list) {
            groupByList.add(map.get("groupType")); //从列【分组的别名】查value
            totalAmountList.add(map.get("totalAmount"));
        }
        model.addAttribute("groupByList", JSON.toJSON(groupByList));
        model.addAttribute("totalAmountList",JSON.toJSON(totalAmountList));
        model.addAttribute("groupType", SaleChartQueryObject.groupByMap.get(qo.getGroupBy())); //按照什么分组 ,valueXX名称
        return "chart/saleChartByBar";
    }

    @RequestMapping("/saleChartByPie")
    public String saleChartByPie(@ModelAttribute("qo") SaleChartQueryObject qo, Model model){
        List<Map<String, Object>> list = chartService.querySaleChart(qo);
        //[{groupType=admin, grossProfit=475600.00, totalAmount=1667400.00, totalNumber=782.00}, {groupType=李四明, grossProfit=86400.00, totalAmount=288000.00, totalNumber=180.00}]
        List<Object> groupByList = new ArrayList<>(); //封装分组条件，横坐标
        List<Map<String,Object>> data = new ArrayList<>(); //存需共享的数据
        BigDecimal max = BigDecimal.ZERO;
        for (Map<String,Object> row : list) {
            Map<String,Object> map=new HashMap<>();
            data.add(map);
            BigDecimal amount = (BigDecimal) row.get("totalAmount");

            map.put("name",row.get("groupType"));
            map.put("value",amount);

            if(amount.compareTo(max)>=0){
                max=amount;
            }
            groupByList.add(row.get("groupType"));
        }
        model.addAttribute("data",JSON.toJSON(data));
        model.addAttribute("groupByList", JSON.toJSON(groupByList));
        model.addAttribute("groupType", SaleChartQueryObject.groupByMap.get(qo.getGroupBy())); //按照什么分组 ,valueXX名称
        model.addAttribute("max",max); //最大销售总额
        return "chart/saleChartByPie";
    }
}
