package com._520it.wms.web.controller;

import com._520it.wms.domain.Role;
import com._520it.wms.query.QueryObject;
import com._520it.wms.service.IPermissionService;
import com._520it.wms.service.IRoleService;
import com._520it.wms.service.ISystemMenuService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IPermissionService permissionService;
    @Autowired
    private ISystemMenuService systemMenuService;

    @RequiredPermission("角色列表")
    @RequestMapping("/list")
    public String list(QueryObject qo, Model model){
        model.addAttribute("result",roleService.query(qo));
        return "role/list";
    }

    @RequiredPermission("角色删除")
    @RequestMapping("/delete")
    @ResponseBody
    public JSONResult delete(Long id){
        if(id!=null){
            roleService.delete(id);
        }
        return new JSONResult();
    }

    @RequiredPermission("角色编辑")
    @RequestMapping("/input")
    public String input(Long id,Model model){
        if(id!=null){
            model.addAttribute("role",roleService.get(id));
        }
        model.addAttribute("permissions",permissionService.list());
        model.addAttribute("menus",systemMenuService.list());

        return "role/input";
    }

    @RequiredPermission("角色保存或更新")
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Role role,Long[] permissionIds,Long[] menuIds){
        roleService.saveOrUpdate(role,permissionIds,menuIds);
        return "redirect:/role/list.do";
    }

}
