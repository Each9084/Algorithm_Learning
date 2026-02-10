package JavaBase.oopExample.ThreeMainFeatures;


class A {
    public String name;

    public A(){
        System.out.println("我是A类的wu参构造");
    }

    public A(String name){
        System.out.println(name + "我是A类的you参构造");
    }
}


class B extends A{
    public B(){
        System.out.println("我是B类的wu参构造");
    }



    public B(String name){
        // 默认调用了父类无参构造方法：
        // 可选一：什么都不写，默认会加上 super() 方法
        // super();     // 可选二：手动写出，效果和可选一一致
        // super(name); // 可选三：如果你想调用父类的有参构造，请取消这一行的注释

        System.out.println(name + "我是B类的you参构造");
    }


}



public class Test3 {
    public static void main(String[] args) {
        // 第一次实例化：触发 B() -> 隐式调用 A()
        System.out.println("--- 第一次实例化 b1 ---");

        B b = new B();
        System.out.println();

        // 第二次实例化：触发 B(String) -> 隐式调用 A()
        System.out.println("--- 第二次实例化 b2 ---");
        B b2 = new B("B");
    }
}
