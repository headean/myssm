package com.maven.model;

import java.util.Date;

public class Menu {
    private Integer menuId;

    private String menuName;

    private Integer menuParentId;

    private String description;

    private Integer enable;

    private Date genTime;

    public Menu(Integer menuId, String menuName, Integer menuParentId, String description, Integer enable, Date genTime) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuParentId = menuParentId;
        this.description = description;
        this.enable = enable;
        this.genTime = genTime;
    }

    public Menu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
