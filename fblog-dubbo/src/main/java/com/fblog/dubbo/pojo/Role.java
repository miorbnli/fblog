package com.fblog.dubbo.pojo;

import com.fblog.common.po.BasePojo;

public class Role extends BasePojo{
	private static final long serialVersionUID = -5860096228795237472L;

	private Integer roleId;

    private String name;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

}