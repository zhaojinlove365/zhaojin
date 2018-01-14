package com._520it.wms.web.controller;

import com._520it.wms.domain.Employee;
import com._520it.wms.query.EmployeeQueryObject;
import com._520it.wms.service.IDepartmentService;
import com._520it.wms.service.IEmployeeService;
import com._520it.wms.service.IRoleService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IDepartmentService departmentService;
    @Autowired
    private IRoleService roleService;

    @RequiredPermission("员工列表")
    @RequestMapping("/list")
    public String list(@ModelAttribute("qo") EmployeeQueryObject qo, Model model){
        model.addAttribute("result",employeeService.query(qo));
        model.addAttribute("depts",departmentService.list());
        return "employee/list";
    }

    @RequiredPermission("员工删除")
    @RequestMapping("/delete")
    @ResponseBody
    public JSONResult delete(Long id){
        if(id!=null){
            employeeService.delete(id);
        }
        return new JSONResult();
    }

    @RequiredPermission("员工批量删除")
    @RequestMapping("/batchDelete")
    @ResponseBody
    public JSONResult batchDelete(Long[] ids){
        if(ids!=null&&ids.length>0){
            employeeService.batchDelete(ids);
        }
        return new JSONResult();
    }

    @RequiredPermission("员工编辑")
    @RequestMapping("/input")
    public String input(Long id,Model model){
        if(id!=null){
            model.addAttribute("employee",employeeService.get(id));
        }
        model.addAttribute("depts",departmentService.list());
        model.addAttribute("roles",roleService.list());
        return "employee/input";
    }

    @RequiredPermission("员工保存或更新")
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Employee employee,Long[] roleIds){
        employeeService.saveOrUpdate(employee,roleIds);
        return "redirect:/employee/list.do";
    }

}
