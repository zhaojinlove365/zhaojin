package com._520it.wms.web.controller;

import com._520it.wms.domain.StockOutcomeBill;
import com._520it.wms.query.StockOutcomeBillQueryObject;
import com._520it.wms.service.IClientService;
import com._520it.wms.service.IDepotService;
import com._520it.wms.service.IStockOutcomeBillService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stockOutcomeBill")
public class StockOutcomeBillController {
    @Autowired
    private IStockOutcomeBillService billService;
    @Autowired
    private IDepotService depotService;
    @Autowired
    private IClientService clientService;



    @RequiredPermission("销售出库单列表")
    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")StockOutcomeBillQueryObject qo, Model model){
        model.addAttribute("result",billService.query(qo));
        model.addAttribute("depots",depotService.list());
        model.addAttribute("clients",clientService.list());

        return "stockOutcomeBill/list";
    }
    @RequiredPermission("销售出库单删除")
    @RequestMapping("/delete")
    @ResponseBody
    public JSONResult delete(Long id){
        if(id!=null){
            billService.delete(id);
        }
        return new JSONResult();

    }

    @RequiredPermission("销售出库单编辑")
    @RequestMapping("/input")
    public String input(Long id, Model model){
        if(id!=null){
            model.addAttribute("stockOutcomeBill",billService.get(id));
        }
        model.addAttribute("depots",depotService.list());
        model.addAttribute("clients",clientService.list());
        return "stockOutcomeBill/input";
    }
    @RequiredPermission("销售出库单保存或更新")
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JSONResult saveOrUpdate(StockOutcomeBill bill){
        if(bill!=null&&bill.getId()!=null){
            billService.update(bill);
        }else{
            billService.save(bill);
        }
        return new JSONResult();
    }

    @RequiredPermission("销售出库单审核")
    @RequestMapping("/audit")
    @ResponseBody
    public JSONResult audit(Long id){
        JSONResult jsonResult = new JSONResult();
        try {
            billService.audit(id);
        }catch (Exception e){
           jsonResult.mark(e.getMessage());
        }

        return jsonResult;
    }

    @RequiredPermission("销售出库单查看")
    @RequestMapping("/view")
    public String view(Long id,Model model){
       model.addAttribute("stockOutcomeBill",billService.get(id));
        model.addAttribute("depots",depotService.list());
        model.addAttribute("clients",clientService.list());
        return "stockOutcomeBill/view";
    }


}
