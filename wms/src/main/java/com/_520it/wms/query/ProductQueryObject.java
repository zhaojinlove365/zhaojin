package com._520it.wms.query;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductQueryObject extends QueryObject {

    private String keyword;
    //表示所有的品牌
    private int brandId=-1;

    //排除关键字为空字符串，转成null
    public String getKeyword(){
        return super.empty2null(keyword);
    }

}
