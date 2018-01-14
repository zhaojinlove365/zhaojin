package com._520it.wms.mapper;

import com._520it.wms.domain.Role;
import com._520it.wms.query.QueryObject;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role role);

    Role selectByPrimaryKey(Long id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role role);

    int queryForCount(QueryObject qo);

    List<Role> queryForList(QueryObject qo);

    void insertRelationWithPermission(@Param("roleId")Long roleId, @Param("permissionId") Long permissionId);

    void deleteRelationWithPermission(Long roleId);

    //回显已选中的角色
    List<Role> selectByEmployeeId(Long employeeId);

    void deleteRelationWithSystemMenu(Long roleId);

    void insertRelationWithSystemMenu(@Param("roleId") Long roleId, @Param("menuId") Long menuId);
}