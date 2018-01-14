package com._520it.wms.service;

import com._520it.wms.domain.Role;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;

import java.util.List;


public interface IRoleService {

    void saveOrUpdate(Role role,Long[] permissionIds,Long[] menuIds);

    void delete(Long id);

    Role get(Long id);

    List<Role> list();

    PageResult query(QueryObject qo);

}
