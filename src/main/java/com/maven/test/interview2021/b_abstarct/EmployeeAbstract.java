package com.maven.test.interview2021.b_abstarct;

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
}
