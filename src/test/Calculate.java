package test;

/**
 * 1-100之间9的个数
 */
public class Calculate {
    public static void main(String[] args) {
        int num = 0;
        for(int i =1;i < 101;i++){
            if(i / 10 == 9){
                num++;
            }
            if(i % 10 == 9){
                num++;
            }
        }
        System.out.println(num);
    }
}
