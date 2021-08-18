package com.maven.test.interview2021.b.a_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-18 17:35
 */
public class ListToArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        Object[] toArray = list.toArray();
        System.out.println(toArray);

        String[] array = new String[]{"123", "456"};
        List<String> asList = Arrays.asList(array);
        System.out.println(asList);
    }
}
