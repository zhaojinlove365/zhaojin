package com._520it.wms.service.impl;

import com._520it.wms.domain.Role;
import com._520it.wms.mapper.RoleMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;
import com._520it.wms.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    public void saveOrUpdate(Role role, Long[] permissionIds, Long[] menuIds) {
        if (role != null && role.getId() != null) {
            //删除该角色拥有的所有权限
            roleMapper.deleteRelationWithPermission(role.getId());
            roleMapper.deleteRelationWithSystemMenu(role.getId());

            roleMapper.updateByPrimaryKey(role);
        } else {
            roleMapper.insert(role);
        }
        if (permissionIds != null) {
            for (Long pId : permissionIds) {
                //维护和权限中间表关系
                roleMapper.insertRelationWithPermission(role.getId(), pId);
            }

        }
        //维护和系统菜单中间表关系
        if (menuIds != null) {
            for (Long menuId : menuIds) {
                roleMapper.insertRelationWithSystemMenu(role.getId(), menuId);
            }

        }

    }

    @Override
    public void delete(Long id) {
        //删除该角色拥有的所有权限
        roleMapper.deleteRelationWithPermission(id);
        roleMapper.deleteRelationWithSystemMenu(id);
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Role get(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> list() {
        return roleMapper.selectAll();
    }

    @Override
    public PageResult query(QueryObject qo) {
        int count = roleMapper.queryForCount(qo);
        if (count > 0) {
            return new PageResult(qo.getCurrentPage(), qo.getPageSize(),
                    roleMapper.queryForList(qo), count);
        }

        return PageResult.EMPTY_RESULT;
    }
}
