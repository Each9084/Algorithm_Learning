package JavaBase.oopExample.InnerClassExample;

public class Champion {
    String name = "英雄";
    int age = 0;
    static int money = 500;

    public Champion(){
        Atrox a = new Atrox();
        a.print();
    }


    class Atrox {
        int age = 5000;
        public void print(){
            System.out.println(name);
            System.out.println(money);
            System.out.println(age);
            System.out.println(Champion.this.age);
        }
    }

    public static void main(String[] args) {
        Champion c = new Champion();
        Atrox a = c.new Atrox();
        a.print();
    }
}
