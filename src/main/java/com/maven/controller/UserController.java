package com.maven.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.maven.model.User;
import com.maven.service.IUserService;
import com.maven.util.DataGrid;
import com.maven.util.Result;
import com.maven.util.SHA256Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.mybatis.generator.internal.util.HashCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-06
 * Time: 11:09
 */
@RestController
@RequestMapping("/admin/sys-user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * http://127.0.0.1:8080/login?username=0001&password=123456
     *  @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public ModelAndView doLogin(String username, String password) {
        /**
         * http://localhost:8080/myssm/admin/sys-user/login
         * http://localhost:8080/myssm/logout
         * 1.user SecurityUtils.getSubject().getSession() 可以获取到session信息
         * 2.设置超时时间
         * 3.设置记住用户
         * 4.设置本地IP
         */
        Subject subject = SecurityUtils.getSubject();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login.jsp");
        /**
         * 必须在这个过程加密，SimpleAuthenticationInfo的第二个参数和UsernamePasswordToken中获取的密码比对
         */
        UsernamePasswordToken token = new UsernamePasswordToken(username, SHA256Util.getSHA256StrJava(password));
        System.out.println("password..." + SHA256Util.getSHA256StrJava(password));
        token.setRememberMe(true);
        token.setHost("127.0.0.1");

        try {
            subject.login(token);

            if (subject.isAuthenticated()) {
                System.out.println("登录成功! ==> 8080");
                String principal = (String) subject.getPrincipal();

                subject.getSession().setAttribute("username", principal);
                subject.getSession().setTimeout(10000);

                modelAndView.setViewName("success");

                return modelAndView;
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("登录失败! ==> 8080");
            return modelAndView;
        }

        return modelAndView;
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello...8080");
        return "hello ==> 8080";
    }

//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    public String login(HttpServletRequest req , HttpSession session){
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        Subject subject = SecurityUtils.getSubject();
//
//        try {
//
//            subject.login(new UsernamePasswordToken(username, password));
//            if (subject.isAuthenticated()) {
//                String principal = (String) subject.getPrincipal();
//
//                session.setAttribute("username", principal);
//
//                return "redirect:/success";
//            }
//
//        } catch (Exception e) {
//            req.setAttribute("shiroLoginFailure", e.getClass().getName());
//        }
//
//        return "redirect:login.jsp";
//    }

    @RequestMapping("/success")
    public String sucess(){
        return "success";
    }

    public Result getById(Serializable id){
        User user = userService.getById(id);
        return Result.success(user);
    }

    /**
     * http://127.0.0.1:8080/myssm/admin/sys-user/queryUserPage
     * easyDataGrid 分页查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/queryUserPage")
    //@RequiresPermissions("sys:user:list")
    public Result queryUserPage(Map<String, Object> params){
        DataGrid dataGrid = new DataGrid();

        try {
            dataGrid = userService.queryUserPage(params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Result.success(dataGrid);
    }

    /**
     * insert
     * @param entity
     * @return
     */
    @ResponseBody
    @RequestMapping("/save")
    public Result save(User entity){
        //if (StringUtils.isEmpty((CharSequence) entity)) {
        //    return Result.failure(ResultCode.PARAM_IS_BLANK);
        //}
        // 插入一条记录（选择字段，策略插入）
        boolean save = userService.save(entity);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/saveBatch")
    public Result saveBatch(Collection<User> entityList){
        // 插入（批量）
        boolean save = userService.saveBatch(entityList);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/saveBatchInt")
    public Result saveBatchInt(Collection<User> entityList, int batchSize){
        // 插入（批量）
        boolean save = userService.saveBatch(entityList, batchSize);
        return Result.success(save);
    }

    /**
     * insert or update
     * @param entity
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveOrUpdate")
    public Result saveOrUpdate(User entity){
        // TableId 注解存在更新记录，否插入一条记录
        boolean save = userService.saveOrUpdate(entity);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/saveOrUpdateEnd")
    public Result saveOrUpdateEnd(User entity, Wrapper<User> updateWrapper){
        // 批量修改插入
        boolean save = userService.saveOrUpdate(entity, updateWrapper);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/saveOrUpdateBatch")
    public Result saveOrUpdateBatch(Collection<User> entityList){
        // 根据updateWrapper尝试更新，否继续执行saveOrUpdate(T)方法
        boolean save = userService.saveOrUpdateBatch(entityList);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/saveOrUpdateBatchInt")
    public Result saveOrUpdateBatchInt(Collection<User> entityList, int batchSize){
        // 批量修改插入
        boolean save = userService.saveOrUpdateBatch(entityList, batchSize);
        return Result.success(save);
    }

    /**
     * delete
     * @param queryWrapper
     * @return
     */
    @ResponseBody
    @RequestMapping("/remove")
    public Result remove(Wrapper<User> queryWrapper){
        // 根据 entity 条件，删除记录
        boolean save = userService.removeById(queryWrapper);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/removeById")
    public Result removeById(Serializable id){
        // 根据 ID 删除
        boolean save = userService.removeById(id);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/removeByMap")
    public Result removeByMap(Map<String, Object> columnMap){
        // 根据 columnMap 条件，删除记录
        boolean save = userService.removeByMap(columnMap);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/removeByIds")
    public Result removeByIds(Collection<? extends Serializable> idList){
        // 删除（根据ID 批量删除）
        boolean save = userService.removeByIds(idList);
        return Result.success(save);
    }

    /**
     * update
     * @param updateWrapper
     * @return
     */
    @ResponseBody
    @RequestMapping("/update")
    public Result update(Wrapper<User> updateWrapper){
        // 根据 UpdateWrapper 条件，更新记录 需要设置sqlset
        boolean save = userService.update(updateWrapper);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/updateEnd")
    public Result updateEnd(User entity, Wrapper<User> updateWrapper){
        // 根据 whereEntity 条件，更新记录
        boolean save = userService.update(entity, updateWrapper);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/updateById")
    public Result updateById(User entity){
        // 根据 ID 选择修改
        boolean save = userService.updateById(entity);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/updateBatchById")
    public Result updateBatchById(Collection<User> entityList){
        // 根据ID 批量更新
        boolean save = userService.updateBatchById(entityList);
        return Result.success(save);
    }

    @ResponseBody
    @RequestMapping("/updateBatchByIdInt")
    public Result updateBatchByIdInt(Collection<User> entityList, int batchSize){
        // 根据ID 批量更新
        boolean save = userService.updateBatchById(entityList, batchSize);
        return Result.success(save);
    }

}
