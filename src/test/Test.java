package test;

/**
 * 测试类，用来测试类的使用
 */
public class Test extends Dog{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("小黄");
        System.out.println(dog1.getName());
    }
}