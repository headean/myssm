package com.maven.test.interview2021.a.b_abstarct;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-17 14:10
 */
public abstract class EmployeeAbstract implements EmployeeInterface {
    @Override
    public int height() {
        return 170;
    }

    @Override
    public int weight() {
        return 60;
    }

    @Override
    public void eat() {
        System.out.println("eat...");
    }

    public abstract void game();
    // 1.抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
    // 2.抽象类相当于时定义一个类模板，是用来继承的，所以不能直接实例化
    // 3.抽象类中的抽象方法只是声明，不给出方法的具体实现
    // 4.如果类中有抽象方法，则必须是抽象类
    // 5.抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
}
