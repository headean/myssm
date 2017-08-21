package com.maven.dao.mapper;

import com.maven.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

// mybatis 做接口映射
@Repository
public interface UserMapper {
    public List<User> findUserNameById(String user);
}
