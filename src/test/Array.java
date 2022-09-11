package test;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    /**
     * 斐波那契数列的前n项
     * @param
     */
    public static int[] fiboN(int n){
        if(n < 0){
            return null;//null - 空指针（空引用），引用数据类型的默认值，当引用数据类型是null的时候，说明该引用没有保存任何的堆内存地址
        }
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    /**
     * 模仿实现Arrays.toString的功能
     * @param n
     * @return
     */
    public static String toString(int[] n){
        String arr = "";
        arr += "[";
        for (int i = 0; i < n.length; i++) {
            arr += n[i];
            if(i < n.length - 1){
                arr += ", ";
            }
        }
        arr += "]";
        return arr;
    }

    /**
     * 模仿实现Arrays.copyof的功能
     * @param
     */
    public static int[] copyof(int n[]){
        int[] arr = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            arr[i] = n[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = fiboN(n);
        int b = num.length;
        /**
         * JDK中内置的将数组转化为字符串的方法
         */
        //JDK中内置的将数组转化为字符串的方法
        System.out.println(Arrays.toString(num));
        //自己实现的
        System.out.println(toString(num));
        /**
         * JDK中数组的拷贝
         */
        //第一种 全拷贝
        int[] arr1 = Arrays.copyOf(fiboN(n), fiboN(n).length);
        System.out.println(toString(arr1));
        //当所传的数组长度大于或小于原数组的值。
        int[] arr2 = Arrays.copyOf(fiboN(n), fiboN(n).length - 1);//小于 从第一个数开始截取到新数组的长度
        int[] arr3 = Arrays.copyOf(fiboN(n), fiboN(n).length + 1);//大于 超出的部分默认为默认值
        System.out.println(toString(arr2));
        System.out.println(toString(arr3));
        //自身实现
        int[] arr5 = copyof(fiboN(n));
        System.out.println(toString(arr5));
        //
        //第二种 部分拷贝
        int[] arr4 = Arrays.copyOfRange(arr1, 1,6);//意思是从第二个元素开始到第六个元素，实际上是一个左闭右开的形式
        System.out.println(toString(arr4));

//        for (int i : num){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println(b);
    }
}
