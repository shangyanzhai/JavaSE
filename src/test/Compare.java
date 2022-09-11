package test;

/**
 * 写一种方法可以计算两个或三个数之间的最大值
 */
public class Compare {
    public static int max(int a,int b){
        return a > b ? a : b;
    }
    public static int max(int a,int b,int c){
        int tmp = max(a,b);
        return max(tmp,c);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 27;
        int c = 18;
        int num = max(a,c);
        System.out.println(num);
        num = max(a,b,c);
        System.out.println(num);
    }
}
