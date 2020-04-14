package com.maven.test.proxy.staticProxy;

/**
 * Created with IntelliJ IDEA.
 * Description: 静态代理原理及实践
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-04-14 15:06
 */
// 接口
public interface IUserDao {
    void save();
    void find();
}

//目标对象
class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("模拟：保存用户！");
    }

    @Override
    public void find() {
        System.out.println("模拟：查询用户");
    }
}

/**
 * 静态代理
 * 特点：
 * 1. 目标对象必须要实现接口
 * 2. 代理对象，要实现与目标对象一样的接口
 */
class UserDaoProxy implements IUserDao {
    // 代理对象，需要维护一个目标对象
    private IUserDao target = new UserDao();

    @Override
    public void save() {
        System.out.println("代理操作： 开启事务...");
        target.save();   // 执行目标对象的方法
        System.out.println("代理操作：提交事务...");
    }

    @Override
    public void find() {
        target.find();
    }

    public static void main(String[] args) {
        // 代理对象
        IUserDao proxy = new UserDaoProxy();
        // 执行代理方法
        proxy.save();
    }
}
