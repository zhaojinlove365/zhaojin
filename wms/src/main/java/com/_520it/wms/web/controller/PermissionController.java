package com._520it.wms.web.controller;

import com._520it.wms.query.QueryObject;
import com._520it.wms.service.IPermissionService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private IPermissionService permissionService;

    @RequiredPermission("权限列表")
    @RequestMapping("/list")
    public String list(QueryObject qo, Model model){
        model.addAttribute("result",permissionService.query(qo));
        return "permission/list";
    }
    @RequiredPermission("权限删除")
    @RequestMapping("/delete")
    public String delete(Long id){
        if(id!=null){
            permissionService.delete(id);
        }
        return "redirect:/permission/list.do";
    }
    @RequiredPermission("权限加载")
    @RequestMapping("/reload")
    @ResponseBody
    public JSONResult reload(){
        permissionService.reload();
        return new JSONResult();
    }


}
