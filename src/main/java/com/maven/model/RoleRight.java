package com.maven.model;

import java.util.Date;

public class RoleRight {
    private Integer roleRightId;

    private Integer roleId;

    private Integer rightId;

    private Integer enable;

    private Date genTime;

    public RoleRight(Integer roleRightId, Integer roleId, Integer rightId, Integer enable, Date genTime) {
        this.roleRightId = roleRightId;
        this.roleId = roleId;
        this.rightId = rightId;
        this.enable = enable;
        this.genTime = genTime;
    }

    public RoleRight() {
        super();
    }

    public Integer getRoleRightId() {
        return roleRightId;
    }

    public void setRoleRightId(Integer roleRightId) {
        this.roleRightId = roleRightId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
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
