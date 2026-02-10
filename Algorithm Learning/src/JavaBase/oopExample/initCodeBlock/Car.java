package JavaBase.oopExample.initCodeBlock;

public class Car {
    Car(){
        System.out.println("构造方法");
    }

    {
        System.out.println("初始化代码块");
    }


    public static void main(String[] args) {
        new Car();
    }
}

