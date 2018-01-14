package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Supplier extends BaseDomain{
    private String name;
    private String phone; //联系电话
    private String address; //联系地址

}
