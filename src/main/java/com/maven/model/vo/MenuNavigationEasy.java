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

    public List<Object> menuList(List<Map<String, Object>> menu){
        this.menuCommon = menu;

        for (Map<String, Object> x : menu) {
            Map<String, Object> mapArr = new LinkedHashMap<String, Object>();
            if(null == x.get("menu_parent_id")){
                mapArr.put("id", x.get("menu_id"));
                mapArr.put("text", x.get("menu_name"));
                mapArr.put("parentid", x.get("menu_parent_id"));
                mapArr.put("children", menuChild(String.valueOf(x.get("menu_id"))));
                list.add(mapArr);
            }
        }

        return list;
    }

    public List<?> menuChild(String str){
        List<Object> lists = new ArrayList<Object>();

        for(Map<String, Object> a:menuCommon){
            Map<String, Object> childArray = new LinkedHashMap<String, Object>();
            //String menu_parent_id = String.valueOf(a.get("menu_parent_id"));
            if(str.equals(String.valueOf(a.get("menu_parent_id")))){
                childArray.put("id", a.get("menu_id"));
                childArray.put("text", a.get("menu_name"));
                childArray.put("parentid", a.get("menu_parent_id"));
                childArray.put("url", a.get("menu_url"));
                childArray.put("children", menuChild(String.valueOf(a.get("menu_id"))));
                lists.add(childArray);
            }
        }

        return lists;
    }
}
