package test;

/**
 * 类的定义
 * 例： 狗
 */
public class Dog {
    public String Name;//成员变量
    public String Color;
    //构造方法，如果本身没有定义构造方法，编译后的class文件将自动创建一个无参构造，
    //当如果再文件中自身定义了构造方法，无参方法则不会出现，如果在需要使用无参构造，则需要自己定义
    //构造方法是一个没有返回值声明 + 名字同类名一样的
    public Dog(){//实际是一个无参构造方法，构造方法可以重载，所以可以有多个，参数数量不同的构造方法

    }
    public Dog(String Name,String Color){//实际上是一个有参构造方法，可以通过使用this方法，从而避免出现参数使用就近原则
        this.Name = Name;
        this.Color = Color;
    }
    //成员方法
    public void bark(){//实际上是一个成员方法
        System.out.println(Name + "汪汪叫");
    }
    public void wag(){
        System.out.println(Name + "摇尾巴");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();//其中new后面的Dog(),实际上是构造方法，而dog1是一个引用数据类型，引用的是由new出来的对象

        dog1.Color = "黄";
        dog1.Name = "小黄";
        dog1.bark();
        dog1.wag();

        Dog dog2 = new Dog("小黄","黄");
        dog2.bark();
        dog2.wag();
    }
}
