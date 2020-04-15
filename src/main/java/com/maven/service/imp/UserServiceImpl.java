package com.maven.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maven.dao.mapper.UserMapper;
import com.maven.model.User;
import com.maven.service.IUserService;
import com.maven.util.DataGrid;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-06
 * Time: 11:11
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	@Resource
    UserMapper userMapper;

    @Override
    public PageInfo queryUserPage(Map<String, Object> params) {
        PageInfo page;

        if(params != null){
            PageHelper.startPage(1, 10);
            List<Map<String, String>> list = userMapper.queryUserPage(params);
            //用PageInfo对结果进行包装
            page = new PageInfo(list);
            return page;
        } else {
            page = new PageInfo();
        }

        return page;
    }

    //    public User findUserNameById(int id) {
    ////        User user = (User) this.userMapper.findUserNameById(String.valueOf(id));
    //        User user = null;
    //        System.out.println("业务处理模拟返回数据...");
    //
    //        return user;
    //    }
}
