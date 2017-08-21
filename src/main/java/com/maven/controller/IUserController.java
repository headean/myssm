package com.maven.controller;

import com.maven.service.IBaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

public interface IUserController{
    public String findUserNameById(HttpServletRequest request, Model model);
}
