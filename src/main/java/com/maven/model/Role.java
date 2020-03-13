package com.maven.model;

import java.util.Date;

public class Role {
    private Integer roleId;

    private String roleName;

    private Integer roleParentId;

    private Integer enable;

    private Date genTime;

    public Role(Integer roleId, String roleName, Integer roleParentId, Integer enable, Date genTime) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleParentId = roleParentId;
        this.enable = enable;
        this.genTime = genTime;
    }

    public Role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleParentId() {
        return roleParentId;
    }

    public void setRoleParentId(Integer roleParentId) {
        this.roleParentId = roleParentId;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }
}
