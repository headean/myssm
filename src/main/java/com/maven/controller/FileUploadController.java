package com.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.UUID;

@Controller
public class FileUploadController {
    @GetMapping("/page/upload")
    public ModelAndView page() {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("to page upload...");
        modelAndView.setViewName("upload");
        return modelAndView;
    }

    @RequestMapping("/file/upload")
    @ResponseBody
    public void upload(MultipartFile file, HttpServletRequest request) {
        System.out.println("this is file upload...");
//        // 以当前日期创建一个文件夹，避免单个文件夹中文件过多
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        // 截取年月日：2020-11-02
//        String substring = timestamp.toString().substring(0, 10);
//        // 设置文件上传存放的路径
//        String uploadPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload/" + substring);
//
//        System.out.println("获取到的图片上传地址为：" + uploadPath);
//        // 获取上传文件名字
//        String uploadName = file.getOriginalFilename();
//        System.out.println("原始文件名：" + uploadName);
//        // 利用UUID生成新的图片名字，避免原图片被覆盖
//        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//
//        // 截取上传文件的后缀
//        String suffix = uploadName.substring(uploadName.lastIndexOf("."));
//        // 拼接新的文件名字
//        String newUploadName = uuid + suffix;
//        System.out.println("新的文件名：" + newUploadName);
//
//        File dir = new File(uploadPath, newUploadName);
//        // exists() 测试此抽象路径名表示的文件或目录是否存在。
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        //MultipartFile自带的解析方法
//        try {
//            file.transferTo(dir);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
