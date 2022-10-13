package test.作业;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字小游戏
 */
public class GuessNumbers {
    public static void main(String[] args) {
        //首先生成一个随机数
        Random random = new Random();
        int randnum = random.nextInt(100);//不传参就代表再正整数范围内随机取一个值，传参则代表再0-所给的值之间随机取值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请从0-100之间随意猜一个数字:");
        while(true){
            int a = scanner.nextInt();
            if(a < randnum){
                System.out.println("小了");
            }else if (a > randnum){
                System.out.println("大了");
            }else if(a == randnum){
                break;
            }
        }

    }
}
