package com.maven.model.vo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-03
 * Time: 16:31
 */
public class MenuNavigationEasy {
    public static Map<String,Object> mapArray = new LinkedHashMap<String, Object>();
    public List<Map<String,Object>> menuCommon;
    public List<Object> list = new ArrayList<Object>();

    public List<Object> menuList(List<Map<String,Object>> menu){
        this.menuCommon = menu;

        for (Map<String,Object> x : menu) {
            Map<String,Object> mapArr = new LinkedHashMap<String, Object>();

            if("0".equals(String.valueOf(x.get("right_parent_id")))){
                mapArr.put("id", x.get("right_id"));
                mapArr.put("text", x.get("right_name"));
                mapArr.put("parentid", x.get("right_parent_id"));
                mapArr.put("children", menuChild(String.valueOf(x.get("right_id"))));
                list.add(mapArr);
            }
        }

        return list;
    }

    public List<?> menuChild(String str){
        List<Object> lists = new ArrayList<Object>();

        for(Map<String,Object> a:menuCommon){
            Map<String,Object> childArray = new LinkedHashMap<String, Object>();

            if(str.equals(String.valueOf(a.get("right_parent_id")))){
                childArray.put("id", a.get("right_id"));
                childArray.put("text", a.get("right_name"));
                childArray.put("parentid", a.get("right_parent_id"));
                childArray.put("url", a.get("description"));
                childArray.put("children", menuChild(String.valueOf(a.get("right_id"))));
                lists.add(childArray);
            }
        }

        return lists;
    }
}
