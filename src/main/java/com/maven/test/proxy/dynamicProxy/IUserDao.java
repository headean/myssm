package com.maven.test.proxy.dynamicProxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description: 动态代理原理及实践
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-04-14 15:19
 */
// 接口
public interface IUserDao {
    void save();

    void find();
}

// 目标对象
class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("模拟： 保存用户！");
    }

    @Override
    public void find() {
        System.out.println("查询");
    }
}

/**
 * 动态代理：
 * 代理工厂，给多个目标对象生成代理对象！
 */
class ProxyFactory {
    // 接收一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回对目标对象(target)代理后的对象(proxy)
    public Object getProxyInstance() {
        Object proxy = Proxy.newProxyInstance(
                // 目标对象使用的类加载器
                target.getClass().getClassLoader(),
                // 目标对象实现的所有接口
                target.getClass().getInterfaces(),
                // 执行代理对象方法时候触发
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        // 获取当前执行的方法的方法名
                        String methodName = method.getName();
                        // 方法返回值
                        Object result;
                        if ("find".equals(methodName)) {
                            // 直接调用目标对象方法
                            result = method.invoke(target, args);
                        } else {
                            System.out.println("开启事务...");
                            // 执行目标对象方法
                            result = method.invoke(target, args);
                            System.out.println("提交事务...");
                        }
                        return result;
                    }
                }
        );
        return proxy;
    }

    public static void main(String[] args) {
        // 创建目标对象
        IUserDao target = new UserDao();
        System.out.println("目标对象：" + target.getClass());
        // 代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("代理对象：" + proxy.getClass());
        // 执行代理对象方法
        proxy.save();
    }
}
