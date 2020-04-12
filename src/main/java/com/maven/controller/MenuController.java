package com.maven.controller;

import com.maven.model.vo.MenuNavigationEasy;
import com.maven.service.IMenuService;
import com.maven.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-03
 * Time: 16:00
 */
@Controller
@RequestMapping("/admin/sys-menu")
public class MenuController {
    @Autowired
    IMenuService menuService;

    /**
     * http://127.0.0.1:8080/myssm/admin/sys-user/findMenuNavigation
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping("/findMenuNavigation")
    Result findMenuNavigation(String userId) {
        List<Map<String, Object>> list = menuService.findMenuNavigation(userId);
        MenuNavigationEasy menuNavigation = new MenuNavigationEasy();
        List<Object> tree = menuNavigation.menuList(list);

        return Result.success(tree);
    }
}
