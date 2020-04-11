package com.maven.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maven.model.Menu;

import java.util.List;
import java.util.Map;

public interface MenuMapper extends BaseMapper<Menu> {
    List<Map<String, Object>> findMenuNavigation(String userId);

    //int deleteByPrimaryKey(Integer menuId);
    //
    //int insert(Menu record);
    //
    //int insertSelective(Menu record);
    //
    //Menu selectByPrimaryKey(Integer menuId);
    //
    //int updateByPrimaryKeySelective(Menu record);
    //
    //int updateByPrimaryKey(Menu record);
}
