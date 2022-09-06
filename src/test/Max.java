package test;

public class Max {
    public static int Max2(int a,int b){
        return a > b ? a : b;
    }
    public static int Max3(int a,int b,int c){
        int max = Max2(a,b);
        return Max2(max,c);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int max = Max3(a,b,c);
        System.out.println(max);
    }
}
