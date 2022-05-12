package com.maven.test.thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2022-03-15 14:19
 */
public class ThreaLocalDemo {
    ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public String test(String t){
        return "1";
    }

    public String test(Object t){
        return "2";
    }

    //public <T> String test(T t){
    //    return null;
    //}

    public static void main(String[] args) {
        String test = new ThreaLocalDemo().test("1".getClass());
        System.out.println(test);
    }

}
