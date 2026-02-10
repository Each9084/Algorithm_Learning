package JavaBase.oopExample;

public class StaticVar {
    static int date = 1;

    int health = 100;

    public int setHealth(int health){
        this.health = health;
        return this.health;
    }

    public static void main(String[] args) {
        System.out.println(StaticVar.date);

        StaticVar sv = new StaticVar();
        sv.setHealth(99);
        System.out.println(sv.health);

    }
}
