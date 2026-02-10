package JavaBase.oopExample.OverrideAndOverload;

class Animal{
    static void move() {
    }
}


class Dog extends Animal{

}
public class OverrideTypePromotion {

    void add(int a,long b){
        System.out.println("int a,long b");
    }

    void add(long a,int b){
        System.out.println("long a,int b");
    }

    public static void main(String[] args) {
        OverrideTypePromotion o  = new OverrideTypePromotion();
    }
}
