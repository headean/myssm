package com.maven.test.interview2021.b_abstarct;

/**
 * Created with IntelliJ IDEA.
 * Description: 人类接口
 *              1.不能用于实例化对象
 *              2.没有构造方法
 *              3.所有的方法必须是抽象方法
 *              4.每一个方法也是隐式抽象的，接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）
 *              5.可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）
 *              6.接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法，可以实现多继承
 *
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-17 14:11
 */
public interface EmployeeInterface {
    public static final String NAME = "张三";

    /**
     * 身高
     * @return
     */
    public abstract int height();

    /**
     * 体重
     * @return
     */
    public abstract int weight();

    /**
     * 吃饭
     */
    public abstract void eat();
}
