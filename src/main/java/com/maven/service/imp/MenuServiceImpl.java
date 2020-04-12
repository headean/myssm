package com.maven.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maven.dao.mapper.MenuMapper;
import com.maven.model.Menu;
import com.maven.service.IMenuService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-03
 * Time: 16:06
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
	@Resource
    MenuMapper menuMapper;

    @Override
    public List<Map<String, Object>> findMenuNavigation(String userId) {
        return menuMapper.findMenuNavigation(userId);
    }
}
