public class add {
    public static void main(String[] args) {
        int b = 0;
        for(int a = 1;a < 101;a++){
            b += a;
        }
        System.out.println(b);
        //String c = b + "hello";
        //System.out.println(c);
        //String c = String.valueOf(b);
        //System.out.println(c + 10);
        String c = "123456";
        int d = Integer.parseInt(c);
        System.out.println(d + 1);
    }
}
