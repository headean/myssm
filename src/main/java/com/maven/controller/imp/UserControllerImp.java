package com.maven.controller.imp;

import com.maven.controller.IUserController;
import com.maven.model.User;
import com.maven.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("test")
public class UserControllerImp extends BaseControllerImp implements IUserController{
    @Resource
    private IUserService userService;

    @RequestMapping("test")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.findUserNameById(userId);
        model.addAttribute("user", user);
        return "test";
    }
}