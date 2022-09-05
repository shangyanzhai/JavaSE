package test;

import com.sun.jmx.snmp.SnmpUnknownModelException;

import java.util.Scanner;

public class SecretCode {
    public static void main(String[] args) {
        //编写代码模拟三次密码输入的场景。最多能输入三次密码，密码正确，提示“登录成功”,密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
        int sercetcode = 123456;//sercetcode为设定的密码
        int num = 0;//用来计数，当num == 3的时候结束程序
        System.out.println("请输入六位数密码");
        Scanner scanner = new Scanner(System.in);
        int scanf = scanner.nextInt();//scanf为输入
        num++;
        while(scanf != sercetcode){
            System.out.println("密码错误");
            num++;
            scanf = scanner.nextInt();
            if(num == 3){
                if(scanf != sercetcode){
                    System.out.println("登陆失败，程序退出");
                    num++;
                }
                break;
            }
        }
        if(num <= 3){
            System.out.println("登录成功");
        }
    }
}
