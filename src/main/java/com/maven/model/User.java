package com.maven.model;

import java.util.Date;
import java.util.Objects;

public class User {
    private Integer userId;

    private String userNo;

    private String userPwd;

    private String userName;

    private String email;

    private String phone;

    private Integer enable;

    private Date genTime;

    private Date loginTime;

    private Date lastLoginTime;

    private Integer loginCount;

    public User(Integer userId, String userNo, String userPwd, String userName, String email, String phone, Integer enable, Date genTime, Date loginTime, Date lastLoginTime, Integer loginCount) {
        this.userId = userId;
        this.userNo = userNo;
        this.userPwd = userPwd;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.enable = enable;
        this.genTime = genTime;
        this.loginTime = loginTime;
        this.lastLoginTime = lastLoginTime;
        this.loginCount = loginCount;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userNo, user.userNo) &&
                Objects.equals(userPwd, user.userPwd) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(enable, user.enable) &&
                Objects.equals(genTime, user.genTime) &&
                Objects.equals(loginTime, user.loginTime) &&
                Objects.equals(lastLoginTime, user.lastLoginTime) &&
                Objects.equals(loginCount, user.loginCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userNo, userPwd, userName, email, phone, enable, genTime, loginTime, lastLoginTime, loginCount);
    }
}
