package com.maven.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 阿里巴巴 FastJson
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-07-01 16:58
 */
@RestController
public class TestFastJson {
    private static String json = "{\n" +
            "  \"code\": 1,\n" +
            "  \"msg\": \"成功\",\n" +
            "  \"data\": {\n" +
            "\"QueryReturn\":[[\"000\",\"\",\"\",\"\"],[\"aaaa\",\"dddd\",\"ssss\",\"dddd\"]]" +
            "    \"ren\": {\n" +
            "        \"name\": \"zhangsan\",\n" +
            "        \"id\": \"001\"\n" +
            " },\n" +
            " \"car\": {\n" +
            "        \"name\": \"baoma\",\n" +
            "        \"code\": \"785\"\n" +
            " },\n" +
            " \"fangzi\": {\n" +
            "        \"color\": \"red\",\n" +
            "        \"code\": \"156\"\n" +
            " },\n" +
            "  }\n" +
            "}";

    private static String indexJson = "{\n" +
            "\"QueryReturn\":[[\"000\",\"\",\"\",\"\"],[\"ZZXZ\",\"ZY\",\"XP\",\"XM\"],[\"aaaa\",\"dddd\",\"ssss\",\"dddd\"]]\n" +
            "}";

    /**
     * http://www.localhost:8861/api/admin/sys-test/test
     */
    @GetMapping("/api/admin/sys-test/test")
    public void test() {
        JSONObject jsonObject = JSONObject.parseObject(json);

        //String jsonData = jsonObject.get("data").toString();
        //JSONObject data = JSONObject.parseObject(jsonData);
        //
        //String jaonRen = data.get("ren").toString();
        //JSONObject ren = JSONObject.parseObject(jao  nRen);
        //
        //System.out.println(ren.get("name"));
        //System.out.println(data.getClass());

        System.out.println("jsonObject.get(\"data\") ==> " + jsonObject.get("data"));
        System.out.println("jsonObject.getString(\"data\")  ==> " + jsonObject.getString("data"));
        System.out.println("jsonObject.get(\"ren\")  ==> " + jsonObject.get("ren"));
        System.out.println("jsonObject.getString(\"ren\")  ==> " + jsonObject.getString("ren"));
        System.out.println("sonObject.getJSONObject(\"data\").getString(\"ren\")  ==> " + jsonObject.getJSONObject("data").getString("ren"));
        System.out.println("jsonObject.getJSONObject(\"data\").getJSONObject(\"ren\")  ==> " + jsonObject.getJSONObject("data").getJSONObject("ren"));
        System.out.println("jsonObject.getJSONObject(\"data\").getJSONObject(\"ren\").getString(\"name\")  ==> " + jsonObject.getJSONObject("data").getJSONObject("ren").getString("name"));

    }

    public static void main(String[] args) throws Exception {
        //JSONObject jsonObject = JSONObject.parseObject(json);
        //System.out.println("sonObject.getJSONObject(\"data\").getString(\"ren\")  ==> " + jsonObject.getJSONObject("data").getString("ren"));
        //System.out.println("jsonObject.getJSONObject(\"data\").getJSONObject(\"ren\").getString(\"name\")  ==> " + jsonObject.getJSONObject("data").getJSONObject("ren").getString("name"));
        //System.out.println("如果需要获取 json 中 key-value 值 是 object 的 则需要使用 getJSONObject");

        JSONObject jsonObject = JSONObject.parseObject(indexJson);
        JSONArray queryReturn = jsonObject.getJSONArray("QueryReturn");
        //String[][] index = queryReturn.toArray(new String[0][]);
        //String[][] str = parsew1(queryReturn.toString());
        System.out.println("jsonObject.getJSONObject(\"QueryReturn\")  ==> " + jsonObject.getJSONArray("QueryReturn"));
        //String[] o = (String[]) queryReturn.get(0);
        //System.out.println("queryReturn.get(0) ==> " + o[0]);
        System.out.println("queryReturn.get(0) ==> " + queryReturn.getString(0));
        System.out.println("queryReturn.get(1) ==> " + queryReturn.getString(1));
        System.out.println("queryReturn.get(2) ==> " + queryReturn.getString(2));
        //JSONArray.parseObject((String) queryReturn.get(2));
        System.out.println("queryReturn.size()  ==> " + queryReturn.size());
        List<String> l = (List<String>) queryReturn.get(1);
        String[][] str = new String[queryReturn.size()][l.size()];
        for (int i = 0; i < queryReturn.size(); i++) {
            //JSONObject jsonObject1 = JSONArray.parseObject(queryReturn.getString(i));
            List<String> list = (List<String>) queryReturn.get(i);
            System.out.println(list);
            //String s = String.valueOf(queryReturn.get(i));
            //System.out.println(s);
            //String[] ss = new String[queryReturn.getString(i).length()];
            //System.out.println(ss);
            //JSONArray objects = new JSONArray(Collections.singletonList(s));
            //String[] ss = new String[queryReturn.get];

            for (int j = 0; j < list.size(); j++) {
                String s = list.get(j);
                System.out.println(s);
                System.out.println(str[i][j]);
                str[i][j] = list.get(j);
            }
        }
        System.out.println(JSONObject.toJSONString(str));

        List<QGRKXX> list=new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i][3] != null && str[i][3] != "" && !str[i][3].equals("XM")) {
                //数组的值ZZXZ,ZY,XP,XM,XB,WHCD,SG,SFZH,MZ,JGSSX,JGGJ,HYZK,HKSZD,FWCS,CYM,CSRQ,CSDXZ,CSD,BYQK
                QGRKXX qurkxx = new QGRKXX();
                String XB = "";
                if (str[i][4].equals("1")) {
                    XB = "男";
                } else if (str[i][4].equals("2")) {
                    XB = "女";
                } else {
                    XB = "未知";
                }
                //String MZ = WxfQuery.fy(str[i][8]);
                //String HKSZD = WxfQuery.hkszd(str[i][12]);
                qurkxx.setXM(str[i][3]);
                qurkxx.setCYM(str[i][14]);
                qurkxx.setXB(XB);
                qurkxx.setSFZH(str[i][7]);
                qurkxx.setXP(str[i][2]);
                //qurkxx.setHKSZD(HKSZD);
                //qurkxx.setMZ(MZ);
                qurkxx.setCSRQ(str[i][15]);
                qurkxx.setZZXZ(str[i][0]);
                list.add(qurkxx);
            }
        }

        System.out.println(JSONObject.toJSON(list));
    }

    public static String[][] parsew1(String protocolXML) {
        String[][] str = new String[25][25];
        int x = 0;
        try {
            Document doc = (Document) DocumentHelper.parseText(protocolXML);
            Element books = doc.getRootElement();
            //  System.out.println("根节点"+books.getName());
            Iterator users_subElements = books.elementIterator();//指定获取那个元素
            Iterator Elements = books.elementIterator();
            while (Elements.hasNext()) {
                Element user = (Element) Elements.next();
                //    System.out.println("节点"+user.getName()+"\ttext="+user.getData());
                List subElements = user.elements();
                List user_subElements = user.elements();//指定获取那个元素
                //  System.out.println("size=="+subElements.size());
                for (int i = 0; i < subElements.size(); i++) {
                    Element ele = (Element) subElements.get(i);
                    //     System.out.println(ele.getName());
                    Iterator Elements2 = ele.elementIterator();
                    while (Elements2.hasNext()) {//进入Items节点下
                        Element data = (Element) Elements2.next();
                        // 	  System.out.println(data.getName());
                        List subElements2 = data.elements();
                        for (int j = 0; j < subElements2.size(); j++) {//进入Item节点下
                            Element ele2 = (Element) subElements2.get(j);
                            //	System.out.println(ele2.getName()+"1111");
                            Iterator Elements3 = ele2.elementIterator();
                            int y = 0;
                            while (Elements3.hasNext()) {
                                x++;
                                Element data2 = (Element) Elements3.next();
                                //	System.out.println(data2.getName()+"-----");
                                List subElements3 = data2.elements();
                                for (int a = 0; a < subElements3.size(); a++) {//进入row节点下
                                    Element ele3 = (Element) subElements3.get(a);
                                    str[x][a] = ele3.getText();
                                    if (x == 1 && a == 0) {
                                        if (!ele3.getText().equals("000")) {

                                            //	 System.out.println("error:  "+ele3.getName()+ele3.getText());

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        System.out.println("retrun str: " + str);
        return str;
    }

}
