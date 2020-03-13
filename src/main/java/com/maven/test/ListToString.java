package com.maven.test;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-08
 * Time: 13:25
 */
public class ListToString {
    public static void main(String[] args) {
        test();
    }

    public static StringBuilder test(){
        Set<String> result = new HashSet<String>();
        result.add("1");
        result.add("2");
        result.add("3");
        result.add("4");
        result.add("5");
        List<String> slist = new ArrayList<String>(result);
        System.out.println(slist.toString());

        // 2.
        String join = StringUtils.join(slist, ',');
        System.out.println(join.toString());

        String join1 = StringUtils.join(slist, '-');
        System.out.println(join1.toString());

        // 1.
        StringBuilder rString = new StringBuilder();
        //Separator sep = new Separator(",");
        String sep = ",";
        for (String each : slist) {
            rString.append(each).append(sep);
        }
        System.out.println(rString.toString());

        return rString;
    }
}
