package JavaBase.oopExample.ThreeMainFeatures;

class Animal {

    public void sayHello(){
        System.out.println("hello,everybody");
    }

}

    class Dog extends Animal{}



public class ThreeMainFeaturesTest{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello();

    }

}