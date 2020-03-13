package com.maven.model;

import java.util.Date;

public class Right {
    private Integer rightId;

    private String rightName;

    private Integer rightParentId;

    private String description;

    private Integer enable;

    private Date genTime;

    public Right(Integer rightId, String rightName, Integer rightParentId, String description, Integer enable, Date genTime) {
        this.rightId = rightId;
        this.rightName = rightName;
        this.rightParentId = rightParentId;
        this.description = description;
        this.enable = enable;
        this.genTime = genTime;
    }

    public Right() {
        super();
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName == null ? null : rightName.trim();
    }

    public Integer getRightParentId() {
        return rightParentId;
    }

    public void setRightParentId(Integer rightParentId) {
        this.rightParentId = rightParentId;
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
