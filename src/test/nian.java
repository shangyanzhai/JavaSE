package test;

public class nian {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;
        while(a < 2023){

            if((a % 4 == 0&&a % 100 != 0)||a % 400 ==0){
                b++;
            }
            //if (a % 400 ==0){
               // b++;
            //}
            a++;
        }
        System.out.println(b);
    }
}
