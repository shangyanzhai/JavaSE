package test;

/**
 * 求两个数之间的最大公约数
 */
public class MaxCommon {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = a < b? a : b;
        int d = 0;
        for(int i = 1;i <= c;i++){
            if((a % i == 0)&&(b % i ==0)){
                d = i;
            }
        }
        System.out.println(d);
    }
}
