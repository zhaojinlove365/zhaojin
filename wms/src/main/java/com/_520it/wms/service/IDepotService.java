package com._520it.wms.service;

import com._520it.wms.domain.Depot;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;

import java.util.List;

/**
 * Created by John on 2017/10/13.
 */
public interface IDepotService {

    void saveOrUpdate(Depot depot);

    void delete(Long id);

    Depot get(Long id);

    List<Depot> list();

    PageResult query(QueryObject qo);

}
