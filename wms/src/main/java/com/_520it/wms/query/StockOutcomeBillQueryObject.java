package com._520it.wms.query;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by John on 2017/10/18.
 */
@Getter
@Setter
public class StockOutcomeBillQueryObject extends BaseAuditQueryObject {

    private Long depotId = -1L;

    private Long clientId = -1L;




}
