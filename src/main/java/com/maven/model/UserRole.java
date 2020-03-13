package com.maven.model;

import java.util.Date;

public class UserRole {
    private Integer userRoleId;

    private Integer userId;

    private Integer roleId;

    private Integer enable;

    private Date genTime;

    public UserRole(Integer userRoleId, Integer userId, Integer roleId, Integer enable, Date genTime) {
        this.userRoleId = userRoleId;
        this.userId = userId;
        this.roleId = roleId;
        this.enable = enable;
        this.genTime = genTime;
    }

    public UserRole() {
        super();
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
