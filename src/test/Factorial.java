package test;

import java.util.Scanner;

public class Factorial {
    /***
     * 计算1-n的阶乘之和
     * @param n
     * @return
     */
    public static int factorial(int n){
        int add = 0;
        for (int i = 1; i <= n ; i++) {
            int num = 1;
            for (int j = 1; j <= i ; j++) {
                num *= j;
            }
            add += num;
        }
        return add;
    }

    /**
     * 计算n的阶乘
     * @param n
     * @return
     */
    public static int factorial1(int n){
        int num = 1;
        for (int j = 1; j <= n ; j++) {
            num *= j;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int add = factorial(n);
        int num = factorial1(n);
        System.out.println(num);
        System.out.println(add);
    }
}
