package test;

import java.util.Arrays;

public class Oddnumber {
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
    //如数组：[1,2,3,4,5,6]
    //调整后可能是：[1, 5, 3, 4, 2, 6]

    /**
     * 当数组为连续数字时
     * @param n
     */
    //例如[1,2,3,4,5,6]
    public static void sequence1(int[] n){
        int left = 0;
        int right = n.length - 1;
        if(n.length % 2 == 0){//说明这是一个长度为偶数，且连续的数组，left和right对应的两个元素一个为奇数一个为偶数
            while(left < right){
                if(n[left] % 2 == 0){//left为偶数，则代表right为奇数，则两者交换
                    int tmp = n[left];
                    n[left] = n[right];
                    n[right] = tmp;
                }
                left++;
                right--;
            }
        }else{//说明长度为奇数，且连续的数组，则，left和right对用的两个元素为同一类型
            if(n[left] % 2 == 0){//left为偶数，则说明，right为偶数，那么right - 1 则为奇数
                right = right - 1;
            }else{
                left = left + 1;
            }
            while(left < right){
                if(n[left] % 2 == 0){//left为偶数，则代表right为奇数，则两者交换
                    int tmp = n[left];
                    n[left] = n[right];
                    n[right] = tmp;
                }
                left++;
                right--;
            }
        }
    }

    /**
     * 当数组为不连续数组时
     * @param n
     */
    public static void sequeence2(int[] n){
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if((n[j] % 2 == 0)&&(n[j + 1] % 2 != 0)){//当且仅当前者为偶数，后者为奇数的时候交换。
                    int tmp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 方法三 双引用--思路是左边left，右边right，left一直读到为偶数为止，right一直读到为奇数为止
     * @param n
     */
    public static void sequeence3(int[] n){
        int left = 0;
        int right = n.length -1;
        while(left < right){
//            if((n[left] % 2 == 0)&&(left < right)){
//                if((n[right] % 2 != 0)&&(left < right)){
//                    int tmp = n[left];
//                    n[left] = n[right];
//                    n[right] = tmp;
//                }
//                right--;
//                continue;
//            }
//            left++;
            while((n[left] % 2 != 0)&&(left < right)){//       内存循环依旧需要写终止条件,如果全是奇数或是全是偶数的情况下可能造成越界
                left++;
            }
            while((n[right] % 2 == 0)&&(left < right)){
                right--;
            }
            int tmp = n[left];
            n[left] = n[right];
            n[right] = tmp;
        }
    }
    public static void main(String[] args) {
        int n[] = new int[]{1,2,3,4,5,6};
//        int n[] = new int[]{1,1,1,1,1,1};
//        sequence1(n);//此方法仅限连续的数组
//        sequeence2(n);
        sequeence3(n);
        System.out.println(Arrays.toString(n));
    }
}
