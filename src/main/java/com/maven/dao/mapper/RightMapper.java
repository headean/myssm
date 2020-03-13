package com.maven.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maven.model.Right;

import java.util.List;
import java.util.Map;

public interface RightMapper extends BaseMapper<Right> {
    List<Map<String, Object>> findMenuNavigation(String userId);

    int deleteByPrimaryKey(Integer rightId);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Integer rightId);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
}
