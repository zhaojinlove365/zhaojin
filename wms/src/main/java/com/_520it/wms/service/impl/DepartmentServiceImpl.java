package com._520it.wms.service.impl;

import com._520it.wms.domain.Department;
import com._520it.wms.mapper.DepartmentMapper;
import com._520it.wms.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public void saveOrUpdate(Department dept) {
        if(dept!=null&&dept.getId()!=null){
            departmentMapper.updateByPrimaryKey(dept);
        }else{
            departmentMapper.insert(dept);
        }
    }

    @Override
    public void delete(Long id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Department get(Long id) {

        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Department> list() {

        return departmentMapper.selectAll();
    }
}
