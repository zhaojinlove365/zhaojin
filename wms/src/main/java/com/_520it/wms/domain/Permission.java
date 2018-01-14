package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Permission extends BaseDomain{
    //权限名称
    private String name;
    //权限表达式
    private String expression;

}
