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
public class MenuNavigation {
    public static Map<String,Object> mapArray = new LinkedHashMap<String, Object>();
    public List<Map<String,Object>> menuCommon;
    public List<Object> list = new ArrayList<Object>();

    public List<Object> menuList(List<Map<String,Object>> menu){
        this.menuCommon = menu;
        for (Map<String,Object> x : menu) {
            Map<String,Object> mapArr = new LinkedHashMap<String, Object>();
            if("0".equals(String.valueOf(x.get("menuParentId")))){
                mapArr.put("id", x.get("menuId"));
                mapArr.put("text", x.get("menuName"));
                mapArr.put("parentid", x.get("menuParentId"));
                mapArr.put("children", menuChild(String.valueOf(x.get("menuId"))));
                list.add(mapArr);
            }
        }

        return list;
    }

    public List<?> menuChild(String str){
        List<Object> lists = new ArrayList<Object>();
        for(Map<String,Object> a:menuCommon){
            Map<String,Object> childArray = new LinkedHashMap<String, Object>();
            //String menuParentId = String.valueOf(a.get("menuParentId"));
            if(str.equals(String.valueOf(a.get("menuParentId")))){
                childArray.put("id", a.get("menuId"));
                childArray.put("text", a.get("menuName"));
                childArray.put("parentid", a.get("menuParentId"));
                //childArray.put("url", a.get("menuUrl"));
                childArray.put("children", menuChild(String.valueOf(a.get("menuId"))));
                lists.add(childArray);
            }
        }

        return lists;
    }
}
