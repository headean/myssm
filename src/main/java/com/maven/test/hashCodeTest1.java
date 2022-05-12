package com.maven.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: hashCode高位运算测试
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-13 11:30
 */
public class hashCodeTest1 {
    private static Map m = new HashMap();
    private static Map n = new HashMap();

    //static final int hash(Object key) {// 11
    //    int h = 0;// 1568
    //    if ((key != null)) {
    //        h = key.hashCode();// 1568
    //        int m = h >>> 16;//
    //        System.out.println(m);
    //        //(key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    //    }
    //    return h;
    //}

    public static void main(String[] args) {
        m.put(16,"16");
        n.put(8,"16");
        int i = m.hashCode();//1589
        int k = n.hashCode();//1581
        System.out.println(i);
        System.out.println(k);

        m.put(8,"15");
        i=m.hashCode();
        System.out.println(i);//3170
    }

}
