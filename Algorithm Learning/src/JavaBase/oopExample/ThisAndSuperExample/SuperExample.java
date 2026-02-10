package JavaBase.oopExample.ThisAndSuperExample;



class Animal{
    String color="red";
    Animal(){
        System.out.println("父类");
    }
}

class Dog extends Animal{
    String color = "Black";

    Dog(){
        System.out.println("子类");
    }

    void printColor (){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperExample {

    public static void main(String[] args) {
        Dog d = new Dog();
        //d.printColor();
    }


}
