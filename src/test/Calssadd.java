package test;

public class Calssadd {
    public static int add(int a,int b){
            return a + b;
    }
    public static double add(double a1,double b1,double c1){
            return a1 + b1 + c1;
    }

    public static void main(String[] args) {
        int c = add(5,9);
        double d = add(1.0,2.6,3.9);
        System.out.println(c);
        System.out.println(d);
    }
}
