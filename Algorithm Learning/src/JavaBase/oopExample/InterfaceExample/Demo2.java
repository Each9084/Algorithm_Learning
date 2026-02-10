package JavaBase.oopExample.InterfaceExample;

interface Coach2 {
    void defend();

    void attack();
}


abstract class AdapterCoach implements Coach2 {
    @Override
    public void defend() {}

    @Override
    public void attack() {}
}

class Condi extends AdapterCoach{
    @Override
    public void defend() {
        System.out.println("不要怂 就是干");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Coach2 coach2 = new Condi();
        coach2.attack();
        coach2.defend();
    }
}
