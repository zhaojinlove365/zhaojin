package com._520it.wms.service.impl;

import com._520it.wms.domain.Employee;
import com._520it.wms.mapper.EmployeeMapper;
import com._520it.wms.mapper.PermissionMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.EmployeeQueryObject;
import com._520it.wms.service.IEmployeeService;
import com._520it.wms.util.MD5;
import com._520it.wms.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public void saveOrUpdate(Employee employee,Long[] roleIds) {
        if (employee != null && employee.getId() != null) {
            employeeMapper.deleteRelationWithRole(employee.getId());
            employeeMapper.updateByPrimaryKey(employee);
        } else {
            employee.setPassword(MD5.encode(employee.getPassword())); //新增时把密码加密
            employeeMapper.insert(employee);
        }
        for (Long roleId : roleIds) {
            employeeMapper.insertRelationWithRole(employee.getId(),roleId);
        }

    }

    @Override
    public void delete(Long id) {
        employeeMapper.deleteRelationWithRole(id);
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Employee get(Long id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> list() {
        return employeeMapper.selectAll();
    }

    @Override
    public PageResult query(EmployeeQueryObject qo) {
        int count = employeeMapper.queryForCount(qo);
        if (count > 0) {
            return new PageResult(qo.getCurrentPage(), qo.getPageSize(),
                    employeeMapper.queryForList(qo), count);
        }

        return PageResult.EMPTY_RESULT;
    }

    @Override
    public void checkLogin(String username, String password) {

        //通过用户名和密码查询用户信息
        Employee current = employeeMapper.selectUserAndPassword(username, MD5.encode(password));
        if(current==null){
            throw new RuntimeException("亲,账号或密码错误");
        }
        //把当前用户信息保存到session中，
        UserContext.setCurrentUser(current);

        // 把用户权限表达式放到session中
        List<String> expressions = permissionMapper.selectPermissionExpressionByEmployeeId(current.getId());
        UserContext.setPermissionExpressions(expressions);


    }

    @Override
    public void batchDelete(Long[] ids) {
        employeeMapper.batchDelete(ids);
    }
}
