package JavaBase.oopExample.ThreeMainFeatures;


interface doA{
    void sayHello();
}

interface doB{
    void eat();
}


class Cat2 implements doA,doB{

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }
}


public class Test2 {
    public static void main(String[] args) {
        Cat2 cat2 = new Cat2();
        cat2.sayHello();
        cat2.eat();
    }

}
