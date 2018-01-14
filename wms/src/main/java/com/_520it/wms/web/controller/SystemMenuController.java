package com._520it.wms.web.controller;

import com._520it.wms.domain.Employee;
import com._520it.wms.domain.SystemMenu;
import com._520it.wms.query.SystemMenuQueryObject;
import com._520it.wms.service.ISystemMenuService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import com._520it.wms.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/systemMenu")
public class SystemMenuController {
    @Autowired
    private ISystemMenuService systemMenuService;

    @RequestMapping("/list")
    @RequiredPermission("系统菜单列表")
    public String list(@ModelAttribute("qo") SystemMenuQueryObject qo, Model model) {
        if(qo.getParentId()!=null){
            SystemMenu parent = systemMenuService.get(qo.getParentId());
            List<Map<String, Object>> menus = systemMenuService.queryMenus(parent);
            model.addAttribute("menus",menus);
        }
        model.addAttribute("result",systemMenuService.query(qo));
        return "systemMenu/list";
    }

    @RequestMapping("/input")
    @RequiredPermission("系统菜单编辑")
    public String input(Long id,Long parentId,Model model){

        if(parentId==null){
            model.addAttribute("parentName","根目录");
        }else{
            SystemMenu parent = systemMenuService.get(parentId);
            model.addAttribute("parentName",parent.getName());
            model.addAttribute("parentId",parent.getId());
        }
        if(id!=null){
            model.addAttribute("systemMenu",systemMenuService.get(id));
        }
        return "systemMenu/input";
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    @RequiredPermission("系统菜单保存或更新")
    public JSONResult saveOrUpdate(Long parentId,SystemMenu sm){
        if(parentId!=null){
            SystemMenu parent = new SystemMenu();
            parent.setId(parentId);
            sm.setParent(parent);
        }
        systemMenuService.saveOrUpdate(sm);
        return new JSONResult();
    }

    @RequestMapping("/delete")
    @ResponseBody
    @RequiredPermission("系统菜单删除")
    public JSONResult delete(Long id){
        if(id!=null){
            systemMenuService.delete(id);
        }
        return new JSONResult();
    }

    //系统菜单加载
    @RequestMapping("/loadMenusByParentSn")
    @ResponseBody
    public List<Map<String,Object>> loadMenusByParentSn(String parentSn){//根据父级菜单编号加载子菜单
        Employee current = UserContext.getCurrentUser();
        if(current.isAdmin()){ //是超级管理员，可以看到所有菜单
             return systemMenuService.queryMenusByParentSn(parentSn);
        }else{
            return systemMenuService.queryMenusByParentSnAndEmployeeId(parentSn,current.getId());
        }

    }
}
