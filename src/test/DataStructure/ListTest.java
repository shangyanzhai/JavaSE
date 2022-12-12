package test.DataStructure;

import java.util.*;

public class ListTest{
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(200);
        list.add(1);
        System.out.println(list);
        list.add(30);

        System.out.println(list);

        System.out.println(list.get(0));

        list.add(0,4000);
        System.out.println(list);

        list.add(list.size(),500);//此时不报错，因为相当于尾插
//        list.add(list.size() + 1,500);//此时不等于尾插，发生了越界访问
        System.out.println(list);

        list.add(0,500);
        System.out.println(list.indexOf(500));//查找500，从前往后
        System.out.println(list.lastIndexOf(500));//从后往前

        System.out.println(list);
        list.remove(0);//删除0位置的数
        System.out.println(list);

        System.out.println(list.subList(1, 3));//切出区间为[1,3)的子集

    }
    /**
     * <...>闭合的尖括号 ———— Java语法中泛型付润特征
     * 泛型分为 定义泛型（类 or 方法）和 使用泛型
     * 现阶段，学会如何使用别人定义好的泛型类（Iterable ,Collection ,List）
     */
}
