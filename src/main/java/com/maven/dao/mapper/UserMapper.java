package com.maven.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.maven.model.User;
import com.maven.util.DataGrid;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface UserMapper extends BaseMapper<User> {
    //int deleteByPrimaryKey(Integer userId);
    //
    //int insert(User record);
    //
    //int insertSelective(User record);
    //
    //User selectByPrimaryKey(Integer userId);
    //
    //int updateByPrimaryKeySelective(User record);
    //
    //int updateByPrimaryKey(User record);

    List<Map<String, String>> queryUserPage(Map<String, Object> params);

	IPage<User> selectPageVo(Page<Map<String, Object>> page, Integer state);
}
