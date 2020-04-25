package com.maven.service.imp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    public PageInfo<Map<String, String>> queryUserPage(Map<String, Object> params) {
        PageInfo<Map<String, String>> page;

        if(params != null){
            PageHelper.startPage(1, 10);
            List<Map<String, String>> list = userMapper.queryUserPage(params);
            //用PageInfo对结果进行包装
            page = new PageInfo<Map<String, String>>(list);
            return page;
        } else {
            page = new PageInfo<Map<String, String>>();
        }

        return page;
    }
    
	@Override
	public IPage<User> selectPageVo(Page<Map<String, Object>> page, Integer state) {
	    // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
	    // page.setOptimizeCountSql(false);
	    // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
	    // 要点!! 分页返回的对象与传入的对象是同一个
	    return userMapper.selectPageVo(page, state);
	}

    //    public User findUserNameById(int id) {
    ////        User user = (User) this.userMapper.findUserNameById(String.valueOf(id));
    //        User user = null;
    //        System.out.println("业务处理模拟返回数据...");
    //
    //        return user;
    //    }
}
