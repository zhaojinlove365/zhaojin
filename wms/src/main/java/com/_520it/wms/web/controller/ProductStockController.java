package com._520it.wms.web.controller;

import com._520it.wms.query.ProductStockQueryObject;
import com._520it.wms.service.IBrandService;
import com._520it.wms.service.IDepotService;
import com._520it.wms.service.IProductStockService;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("productStock")
public class ProductStockController {
    @Autowired
    private IProductStockService stockService;
    @Autowired
    private IBrandService brandService;
    @Autowired
    private IDepotService depotService;

    @RequestMapping("list")
    @RequiredPermission("即时库存报表")
    public String list(@ModelAttribute("qo")ProductStockQueryObject qo, Model model){
        model.addAttribute("result",stockService.query(qo));
        model.addAttribute("brands",brandService.list());
        model.addAttribute("depots",depotService.list());
        return "productStock/list";
    }

}
