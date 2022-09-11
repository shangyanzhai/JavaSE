package test;

/**
 * 输出1000-2000之间所有的闰年
 */
public class LeapYear {
    public static void main(String[] args) {
        //输出1000-2000之间所有的闰年
        int num = 0;
        for (int i = 1000; i <= 2000 ; i++) {
            if((i % 4 == 0)&&(i % 100 != 0)){
                System.out.println(i);
                num++;
            }else if(i % 400 == 0){
                System.out.println(i);
                num++;
            }
        }
        System.out.println(num);
    }
}
