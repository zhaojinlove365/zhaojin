package com._520it.wms.mapper;

import com._520it.wms.domain.Client;
import com._520it.wms.query.QueryObject;

import java.util.List;

public interface ClientMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Client client);

    Client selectByPrimaryKey(Long id);

    List<Client> selectAll();

    int updateByPrimaryKey(Client client);

    int queryForCount(QueryObject qo);

    List<Client> queryForList(QueryObject qo);
}