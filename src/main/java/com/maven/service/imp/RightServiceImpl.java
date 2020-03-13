package com.maven.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maven.dao.mapper.RightMapper;
import com.maven.model.Right;
import com.maven.service.IRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-03
 * Time: 16:06
 */
@Service
public class RightServiceImpl extends ServiceImpl<RightMapper, Right> implements IRightService {
    @Autowired
    RightMapper rightMapper;

    @Override
    public List<Map<String, Object>> findMenuNavigation(String userId) {
        return rightMapper.findMenuNavigation(userId);
    }
}
