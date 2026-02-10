package JavaBase.oopExample.AbstractExample;

public class Akali extends Hero{
    public Akali(String name, String zone, int age) {
        super(name, zone, age);
    }

    @Override
    void loadModel() {
        System.out.println(getName()+"已加载");
    }


    public static void main(String[] args) {
        Akali a = new Akali("Akali","艾欧尼亚",27);
        a.Recall();
    }
}
