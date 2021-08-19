package com.maven.test.interview2021.b.a_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: Collections 的 synchronizedList 方法将其转换成线程安全的容器
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-19 9:52
 */
public class ArrayListSynchronizedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> synchronizedList = Collections.synchronizedList(list);
        synchronizedList.add("aaa");
        synchronizedList.add("bbb");

        for (int i = 0; i < synchronizedList.size(); i++) {
            System.out.println(synchronizedList.get(i));
        }
    }
}
