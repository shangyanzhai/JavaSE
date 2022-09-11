package test;

/**
 * 打印素数
 */
public class PrintfPrime {
    public static void main(String[] args) {
        for(int i = 2;i < 101;i++){
            if(i == 2){
                System.out.println(i);
                continue;
            }
            for(int j = 2;j < i ;j++) {
                if (i % j == 0) {
                    break;
                }
                if(j + 1 == i){
                    System.out.println(i);
                }
            }
        }
    }
}
