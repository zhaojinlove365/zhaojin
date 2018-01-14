package com._520it.wms.web.controller;

import com._520it.wms.domain.Department;
import com._520it.wms.service.IDepartmentService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;
    @RequiredPermission("部门列表")
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("departments",departmentService.list());
        return "department/list";
    }
    @RequiredPermission("部门删除")
    @RequestMapping("/delete")
    public String delete(Long id){
        if(id!=null){
            departmentService.delete(id);
        }
        return "redirect:/department/list.do";
    }

    @RequiredPermission("部门编辑")
    @RequestMapping("/input")
    public String input(Long id, Model model){
        if(id!=null){
            model.addAttribute("department",departmentService.get(id));
        }
        return "department/input";
    }
    @RequiredPermission("部门保存或更新")
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JSONResult saveOrUpdate(Department department){

        departmentService.saveOrUpdate(department);
        return new JSONResult();
    }

}
