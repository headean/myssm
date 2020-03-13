package com.maven.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.maven.model.User;
import com.maven.service.IUserService;
import com.maven.util.DataGrid;
import com.maven.util.Result;
import com.maven.util.ResultCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    public Result getById(Serializable id){
        User user = userService.getById(id);
        return Result.success(user);
    }

    /**
     * http://127.0.0.1:8002/admin/sys-user/queryUserPage
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
