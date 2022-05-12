package com.maven.test.file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2022-03-31 14:51
 */
public class StreamDemo implements Runnable{
    private static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        String s = readInputSteam("");
        //String s1 = readFileSteam("");
    }

    public static String readFileSteam(String path) {
        String s = "";
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("D:/demo.txt");
            fw = new FileWriter("D:/demo1.txt");
            StringBuilder sb = new StringBuilder();
            int len;
            char[] buffer = new char[1024];

            while ((len = fr.read(buffer)) != -1) {
                //System.out.println(len);
                sb.append(buffer);
                fw.write(buffer,0,len);
            }
            System.out.println(sb);
            s = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return s;
    }

    public static String readInputSteam(String path) {
        String s = "";
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("D:/demo.txt");
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i = fis.read()) != -1) {
                //System.out.println(i);
                char c = (char) i;
                sb.append((char) i);

                if (map.containsKey(c) || map.get(c)!=null) {
                    int num = map.get(c).intValue();
                    //System.out.println(num);
                    map.put(c, ++num);
                } else {
                    map.put(c, 1);
                }
                //for (Character key : map.keySet()) {
                //    System.out.println("Key = " + key);
                //}
            }
            System.out.println(sb);
            s = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return s;
    }

    @Override
    public void run() {

    }
}
