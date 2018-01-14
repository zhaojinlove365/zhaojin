package com._520it.wms.web.controller;

import com._520it.wms.domain.StockIncomeBill;
import com._520it.wms.query.StockIncomeBillQueryObject;
import com._520it.wms.service.IStockIncomeBillService;
import com._520it.wms.service.IDepotService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stockIncomeBill")
public class StockIncomeBillController {
    @Autowired
    private IStockIncomeBillService billService;
    @Autowired
    private IDepotService depotService;



    @RequiredPermission("入库订单列表")
    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")StockIncomeBillQueryObject qo, Model model){
        model.addAttribute("result",billService.query(qo));
        model.addAttribute("depots",depotService.list());
        return "stockIncomeBill/list";
    }
    @RequiredPermission("入库订单删除")
    @RequestMapping("/delete")
    @ResponseBody
    public JSONResult delete(Long id){
        if(id!=null){
            billService.delete(id);
        }
        return new JSONResult();

    }

    @RequiredPermission("入库订单编辑")
    @RequestMapping("/input")
    public String input(Long id, Model model){
        if(id!=null){
            model.addAttribute("stockIncomeBill",billService.get(id));
        }
            model.addAttribute("depots",depotService.list());
        return "stockIncomeBill/input";
    }
    @RequiredPermission("入库订单保存或更新")
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JSONResult saveOrUpdate(StockIncomeBill bill){
        if(bill!=null&&bill.getId()!=null){
            billService.update(bill);
        }else{
            billService.save(bill);
        }
        return new JSONResult();
    }

    @RequiredPermission("入库订单审核")
    @RequestMapping("/audit")
    @ResponseBody
    public JSONResult audit(Long id){
        if(id!=null){
            billService.audit(id);
        }
        return new JSONResult();
    }

    @RequiredPermission("入库订单查看")
    @RequestMapping("/view")
    public String view(Long id,Model model){
       model.addAttribute("stockIncomeBill",billService.get(id));
        model.addAttribute("depots",depotService.list());
        return "stockIncomeBill/view";
    }


}
