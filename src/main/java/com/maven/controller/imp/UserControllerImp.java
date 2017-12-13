package com.maven.controller.imp;

import com.maven.controller.IUserController;
import com.maven.model.User;
import com.maven.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserControllerImp extends BaseControllerImp implements IUserController{
    // getLogger有一个参数指定的是这个logger的名称，这个名称在配置文件里面有需要
    private static Logger logger = LogManager.getLogger(UserControllerImp.class);
    @Resource
    private IUserService userService;

    /**
     * http://localhost:8080/test1/test2?id=1
     * http://localhost:8080/user/findUserNameById?id=1
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("findUserNameById")
    public String findUserNameById(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.findUserNameById(userId);
        model.addAttribute("user", user);
        // logger.debug("Will not show.");
        // logger.error("Hello, World!");

        return "test";
    }
}