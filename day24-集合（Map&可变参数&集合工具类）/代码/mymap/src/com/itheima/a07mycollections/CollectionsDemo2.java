package com.itheima.a07mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
      /*
        public static <T> void sort(List<T> list)                       排序
        public static <T> void sort(List<T> list, Comparator<T> c)      根据指定的规则进行排序
        public static <T> int binarySearch (List<T> list,  T key)       以二分查找法查找元素
        public static <T> void copy(List<T> dest, List<T> src)          拷贝集合中的元素
        public static <T> int fill (List<T> list,  T obj)               使用指定的元素填充集合
        public static <T> void max/min(Collection<T> coll)              根据默认的自然排序获取最大/小值
        public static <T> void swap(List<?> list, int i, int j)         交换集合中指定位置的元素
     */

        System.out.println("-------------copy--------------------------");
        //把list3中的元素拷贝到list4中
        //会覆盖原来的元素
        //注意点：如果list3的长度 > list4的长度，方法会报错
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(list4, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        Collections.copy(list4, list3);
        System.out.println(list3);
        System.out.println(list4);

        System.out.println("-------------fill--------------------------");
        //把集合中现有的所有数据，都修改为指定数据
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.fill(list5, 100);
        System.out.println(list5);

        System.out.println("-------------max/min--------------------------");
        //求最大值或者最小值
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.max(list6));
        System.out.println(Collections.min(list6));

        System.out.println("-------------max/min指定规则--------------------------");
        // String中默认是按照字母的abcdefg顺序进行排列的
        // 现在我要求最长的字符串
        // 默认的规则无法满足，可以自己指定规则
        // 求指定规则的最大值或者最小值
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7, "a","aa","aaa","aaaa");
        System.out.println(Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));

        System.out.println("-------------swap--------------------------");
        ArrayList<Integer> list8 = new ArrayList<>();
        Collections.addAll(list8, 1, 2, 3);
        Collections.swap(list8,0,2);
        System.out.println(list8);



    }
}
