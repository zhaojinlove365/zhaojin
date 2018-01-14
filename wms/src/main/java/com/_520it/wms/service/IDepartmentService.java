package com._520it.wms.service;

import com._520it.wms.domain.Department;

import java.util.List;

/**
 * Created by John on 2017/10/13.
 */
public interface IDepartmentService {

    void saveOrUpdate(Department dept);

    void delete(Long id);

    Department get(Long id);

    List<Department> list();



}
