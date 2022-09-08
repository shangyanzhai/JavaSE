package test;

public class Rscursice {
    public static int test1(int n ){
        if((n == 2)||(n == 1)){
            return 1;
        }
        return test1(n - 1) + test1(n - 2);
    }
    public static int factorial(int n){
        if(n == 2){
            return 2;
        }
        return n * factorial(n-1);
    }
    public static int add(int n){
        if(n == 1){
            return 1;
        }
        return n + add(n-1);
    }
    public static int print(int n){
        int temp = 0;
        for(int i = 1;n / i != 0;i *= 10){
            temp++;
        }
        int num = 1;
        for(int i = 1;i < temp;i++){
            num *= 10;
        }
        if(n < 10){
            System.out.println(n);
            return 0;
        }
        System.out.println(n / num);
        return print(n % num);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int make(int n){
        int temp = 0;
        for(int i = 1;n / i != 0;i *= 10){
            temp++;
        }
        int num = 1;
        for(int i = 1;i < temp;i++){
            num *= 10;
        }
        int a = n / num;
        if(n < 10){
            System.out.print(n * num);
            return 0;
        }
        System.out.print( a * num + "+" );
        return make(n % num);
    }
    public static void main(String[] args) {
        int num = test1(6);
        System.out.println(num);
        num = factorial(5);
        System.out.println(num);
        num = add(10);
        System.out.println(num);
        print(1234);
        make(1234);
    }
}
