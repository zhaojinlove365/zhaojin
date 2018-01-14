package com._520it.wms.web.controller;

import com._520it.wms.domain.OrderBill;
import com._520it.wms.query.OrderBillQueryObject;
import com._520it.wms.service.IOrderBillService;
import com._520it.wms.service.ISupplierService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orderBill")
public class OrderBillController {
    @Autowired
    private IOrderBillService orderBillService;
    @Autowired
    private ISupplierService supplierService;



    @RequiredPermission("采购订单列表")
    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")OrderBillQueryObject qo, Model model){
        model.addAttribute("result",orderBillService.query(qo));
        model.addAttribute("suppliers",supplierService.list());
        return "orderBill/list";
    }
    @RequiredPermission("采购订单删除")
    @RequestMapping("/delete")
    @ResponseBody
    public JSONResult delete(Long id){
        if(id!=null){
            orderBillService.delete(id);
        }
        return new JSONResult();

    }

    @RequiredPermission("采购订单编辑")
    @RequestMapping("/input")
    public String input(Long id, Model model){
        if(id!=null){
            model.addAttribute("orderBill",orderBillService.get(id));
        }
            model.addAttribute("suppliers",supplierService.list());
        return "orderBill/input";
    }
    @RequiredPermission("采购订单保存或更新")
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JSONResult saveOrUpdate(OrderBill orderBill){
        if(orderBill!=null&&orderBill.getId()!=null){
            orderBillService.update(orderBill);
        }else{
            orderBillService.save(orderBill);
        }
        return new JSONResult();
    }

    @RequiredPermission("采购订单审核")
    @RequestMapping("/audit")
    @ResponseBody
    public JSONResult audit(Long id){
        if(id!=null){
            orderBillService.audit(id);
        }
        return new JSONResult();
    }

    @RequiredPermission("采购订单查看")
    @RequestMapping("/view")
    public String view(Long id,Model model){
       model.addAttribute("orderBill",orderBillService.get(id));
        model.addAttribute("suppliers",supplierService.list());
        return "orderBill/view";
    }


}
