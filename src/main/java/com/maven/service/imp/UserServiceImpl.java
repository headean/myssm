package com.maven.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maven.dao.mapper.UserMapper;
import com.maven.model.User;
import com.maven.service.IUserService;
import com.maven.util.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-06
 * Time: 11:11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public DataGrid queryUserPage(Map<String, Object> params) {
        return userMapper.queryUserPage(params);
    }
}
