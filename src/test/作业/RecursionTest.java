package test.作业;

import java.util.Arrays;

public class RecursionTest {

//    public static int f(int[] a ,int begin ,int end)
//    {
//        int x  = 0;
//        x = begin;
//        if (begin <= end) x += f(a ,begin + 1,end);
//        return x;
//    }


    public static int f(int[] a )
    {
        int x = 0;
        return x;
    }

    public static void main(String[] args) {
        int[] a = { 1 , 2 , 3 , 4 , 5 };
        int x = f(a);
        System.out.println(x);
    }
}
