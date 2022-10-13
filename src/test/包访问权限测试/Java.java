package test.包访问权限测试;

import test.Inherit.Dog;

public class Java extends Dog{
    public static void main(String[] args) {
        Java java1 = new Java();
        java1.eyes = "黄";
    }
}
