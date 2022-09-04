package test;

import java.util.Scanner;

public class NarcissusNumber {
    public static void main(String[] args) {
        //水仙花数 例： 153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3//限定条件是一个三位数
        int num = 0;
        for (int i = 100; i < 1000 ; i++) {
            int add;
            int a = i % 10;//a为个位
            int b = i / 10 % 10;//b为十位
            int c = i/ 100;//c为百位
            //add = a * a * a + b * b * b + c * c * c;
            add = a * a * a + b * b * b + c * c * c;
            if(add == i){
                num++;
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}
