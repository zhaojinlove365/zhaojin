package com._520it.wms.service.impl;

import com._520it.wms.domain.Client;
import com._520it.wms.mapper.ClientMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;
import com._520it.wms.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    private ClientMapper clientMapper;
    @Override
    public void saveOrUpdate(Client dept) {
        if(dept!=null&&dept.getId()!=null){
            clientMapper.updateByPrimaryKey(dept);
        }else{
            clientMapper.insert(dept);
        }
    }

    @Override
    public void delete(Long id) {
        clientMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Client get(Long id) {

        return clientMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Client> list() {

        return clientMapper.selectAll();
    }

    @Override
    public PageResult query(QueryObject qo) {
        int count = clientMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),clientMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
