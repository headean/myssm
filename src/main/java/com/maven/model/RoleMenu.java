package com.maven.model;

import java.util.Date;

public class RoleMenu {
    private Integer roleMenuId;

    private Integer roleId;

    private Integer menuId;

    private Integer enable;

    private Date genTime;

    public RoleMenu(Integer roleMenuId, Integer roleId, Integer menuId, Integer enable, Date genTime) {
        this.roleMenuId = roleMenuId;
        this.roleId = roleId;
        this.menuId = menuId;
        this.enable = enable;
        this.genTime = genTime;
    }

    public RoleMenu() {
        super();
    }

    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

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
