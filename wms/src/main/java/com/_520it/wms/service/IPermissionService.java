package com._520it.wms.service;

import com._520it.wms.domain.Permission;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;

import java.util.List;


public interface IPermissionService {


    void delete(Long id);

    List<Permission> list();

    PageResult query(QueryObject qo);

    //加载权限
    void reload();
}
