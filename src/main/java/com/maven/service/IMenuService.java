package com.maven.service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.extension.service.IService;
import com.maven.model.Menu;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-03
 * Time: 16:03
 */
public interface IMenuService extends IService<Menu> {
    List<Map<String, Object>> findMenuNavigation(String userId);
}
