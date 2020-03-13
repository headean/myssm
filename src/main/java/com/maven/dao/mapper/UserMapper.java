package com.maven.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maven.model.User;
import com.maven.util.DataGrid;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Map;

@MapperScan
public interface UserMapper extends BaseMapper<User> {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    DataGrid queryUserPage(Map<String, Object> params);
}
