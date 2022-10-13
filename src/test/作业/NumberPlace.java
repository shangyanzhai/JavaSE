package test.作业;

import java.util.Scanner;

/**
 * 打印a的每一位
 */
public class NumberPlace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
       // int num = 0;
       //for(int i = 1;a / i != 0;i *= 10){
       //    num++;
       //}
        System.out.println(a+"的每一位是");
     //用while语句，截至条件是a == 0
       while(a != 0){
           int b = a % 10;
           System.out.print(b);
           a = a / 10;
       }
    }
}
