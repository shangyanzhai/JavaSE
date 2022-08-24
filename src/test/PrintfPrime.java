package test;

public class PrintfPrime {
    public static void main(String[] args) {
        for(int i = 1;i < 101;i++){
            if(i == 1||i == 2){
                System.out.println(i);
                continue;
            }
            for(int j = 2;j < i ;j++) {
                if (i % j == 0) {
                    break;
                }else if(j + 1 == i){
                    System.out.println(i);
                }
            }
        }
    }
}
