package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class Employee extends BaseDomain{

    private String name;
    private String password;
    private String email;
    private int age;
    //是否是超级管理员
    private boolean admin;
    private Department dept;

    private List<Role> roles=new ArrayList<>();
}
