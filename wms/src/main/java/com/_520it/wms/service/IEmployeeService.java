package com._520it.wms.service;

import com._520it.wms.domain.Employee;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.EmployeeQueryObject;

import java.util.List;

/**
 * Created by John on 2017/10/13.
 */
public interface IEmployeeService {

    void saveOrUpdate(Employee emp,Long[] roleIds);

    void delete(Long id);

    Employee get(Long id);

    List<Employee> list();

    PageResult query(EmployeeQueryObject qo);

    void checkLogin(String username, String password);

    void batchDelete(Long[] ids);
}
