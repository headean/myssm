package com.maven.dao.mapper;

import com.maven.model.User;

import java.util.List;

// mybatis 做接口映射
public interface UserMapper {
    public List<User> findUserNameById(String user);
}
