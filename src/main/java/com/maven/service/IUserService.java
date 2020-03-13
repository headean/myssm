package com.maven.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maven.model.User;
import com.maven.util.DataGrid;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-06
 * Time: 11:11
 */
public interface IUserService extends IService<User> {
    DataGrid queryUserPage(Map<String, Object> params);
}
