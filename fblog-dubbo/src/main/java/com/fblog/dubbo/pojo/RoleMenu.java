package com.fblog.dubbo.pojo;

import com.fblog.common.po.BasePojo;

public class RoleMenu extends BasePojo{

	private static final long serialVersionUID = 8379006595731812982L;

	private Integer roleId;

    private Integer menuId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}