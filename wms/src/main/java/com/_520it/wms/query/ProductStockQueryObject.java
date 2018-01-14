package com._520it.wms.query;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductStockQueryObject extends QueryObject {
    private String keyword; //货品名称或编号
    private Long depotId = -1L; //仓库
    private Long brandId = -1L; //货品品牌
    private Integer limitNumber; //库存阈值

    public String getKeyword() {
        return super.empty2null(keyword);
    }

}
