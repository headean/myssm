package com.maven.test.interview2021.b.a_collection;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: 1、List（有序、可重复）
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-18 11:27
 */
public class ListTest {
    private static final int COUNT = 100000;

    public static void main(String[] args) {
        // 1.ArrayList是基于动态数组实现的List类，它封装了一个动态的增长的、允许再分配的Object[]数组
        // 2.线程异步不安全，效率高，增长率0.5
        // 3.随机访问get和set，优于LinkedList，单条数据插入和删除优于LinkedList
        List<String> arrayList = new ArrayList<>();

        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");

        arrayList.set(2, "0");// 用指定元素替换列表中指定位置的元素，返回以前在指定位置的元素
        int i = arrayList.indexOf("222");// 返回列表中对象第一次出现的索引位置，如果集合中不包含该元素则返回-1
        System.out.println(i);
        int j = arrayList.lastIndexOf("222");// 返回列表中对象最后一次出现的索引位置，如果集合汇总不包含该元素则返回-1
        System.out.println(j);
        // 第一种、最基础的遍历方式：for循环，指定下标长度，使用List集合的size()方法，进行for循环遍历
        for (int k = 0; k < arrayList.size(); k++) {
            System.out.println(arrayList.get(k));
        }
        // 第二种、较为简洁的遍历方式：使用foreach遍历List，但不能对某一个元素进行操作（这种方法在遍历数组和Map集合的时候同样适用）
        for (String l : arrayList) {
            System.out.println(l);
        }
        // 第三种、适用迭代器Iterator遍历：直接根据List集合的自动遍历
        // 迭代器获取集合元素    listIterator 继承了 Iterator
        ListIterator<String> stringListIterator = arrayList.listIterator();
        while (stringListIterator.hasNext()) {
            // 获取集合元素
            String next = stringListIterator.next();
            System.out.println(next);
            // 获取下一个元素下标值
            int nextIndex = stringListIterator.nextIndex();
            System.out.println(nextIndex);
        }

        // 2.实现List接口，能对它进行队列操作，即可以根据索引来随机访问集合中的元素。
        // 同时它还实现Deque接口，即能将LinkedList当作双端队列使用。自然也可以被当作"栈来使用"
        List<String> linkedList = new LinkedList<>();

        // https://www.cnblogs.com/skywang12345/p/3308900.html
        arrayList.clear();
        //linkedList.clear();
        insertByPosition(linkedList);
        insertByPosition(arrayList);

        readByPosition(linkedList);
        readByPosition(arrayList);

        deleteByPosition(linkedList);
        deleteByPosition(arrayList);
    }

    // 向list的指定位置插入COUNT个元素，并统计时间
    private static void insertByPosition(List list) {
        long startTime = System.currentTimeMillis();
        // 向list的位置0插入COUNT个数
        for (int i = 0; i < COUNT; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(getListName(list) + " : insert " + COUNT + " elements into the 1st position use time：" + interval + " ms");
    }

    // 从list的指定位置删除COUNT个元素，并统计时间
    private static void deleteByPosition(List list) {
        long startTime = System.currentTimeMillis();

        // 删除list第一个位置元素
        for (int i = 0; i < COUNT; i++) {
            list.remove(0);
        }

        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(getListName(list) + " : delete " + COUNT + " elements from the 1st position use time：" + interval + " ms");
    }

    // 根据position，不断从list中读取元素，并统计时间
    private static void readByPosition(List list) {
        long startTime = System.currentTimeMillis();

        // 读取list元素
        for (int i = 0; i < COUNT; i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(getListName(list) + " : read " + COUNT + " elements by position use time：" + interval + " ms");
    }

    // 获取list的名称
    private static String getListName(List list) {
        if (list instanceof LinkedList) {
            return "LinkedList";
        } else if (list instanceof ArrayList) {
            return "ArrayList";
        } else if (list instanceof Stack) {
            return "Stack";
        } else if (list instanceof Vector) {
            return "Vector";
        } else {
            return "List";
        }
    }

}
