package test;

public class OrderedSeries {
    public static void main(String[] args) {
        double num = 0;
        for(int i = 1 ; i < 101;i++){
            if(i % 2 != 0){
                num += 1.0 / i;
            }else{
                num -= 1.0 / i;
            }
        }
        System.out.println(num);
    }
}
