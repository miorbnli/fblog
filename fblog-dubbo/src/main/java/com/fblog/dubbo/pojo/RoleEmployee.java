package com.fblog.dubbo.pojo;

import com.fblog.common.po.BasePojo;

public class RoleEmployee extends BasePojo{

	private static final long serialVersionUID = -4461808406052419352L;

	private Integer roleId;

    private Integer employeeId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

}