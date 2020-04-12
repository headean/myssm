package com.maven.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maven.dao.mapper.UserMapper;
import com.maven.model.User;
import com.maven.service.IUserService;
import com.maven.util.DataGrid;
import org.springframework.stereotype.Service;
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
    public DataGrid queryUserPage(Map<String, Object> params) {
        return userMapper.queryUserPage(params);
    }

    //    public User findUserNameById(int id) {
    ////        User user = (User) this.userMapper.findUserNameById(String.valueOf(id));
    //        User user = null;
    //        System.out.println("业务处理模拟返回数据...");
    //
    //        return user;
    //    }
}
