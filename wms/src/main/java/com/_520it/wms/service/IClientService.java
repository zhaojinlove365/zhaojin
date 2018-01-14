package com._520it.wms.service;

import com._520it.wms.domain.Client;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;

import java.util.List;

/**
 * Created by John on 2017/10/13.
 */
public interface IClientService {

    void saveOrUpdate(Client client);

    void delete(Long id);

    Client get(Long id);

    List<Client> list();

    PageResult query(QueryObject qo);

}
