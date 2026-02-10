package JavaBase.oopExample.InterfaceExample;

public class Pig implements Fly,Eat{

    private String name;
    private int age;

    public Pig(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Pig(){};

    @Override
    public void eat() {
        System.out.println(name +"is eating");
    }

    @Override
    public void fly() {
        System.out.println(name + "is flying");
    }


    public static void main(String[] args) {
        Pig xiaozhu = new Pig();
        xiaozhu.name = "zhuyi";
        xiaozhu.age = 11;

        Pig dazhu = new Pig("DAZHU",17);

        xiaozhu.fly();
        xiaozhu.eat();

        dazhu.fly();
        dazhu.eat();
    }

}
