package JavaBase.oopExample.StaticExample;

public class StaticCount {
    static int count = 0;
    String name = "neil";

    StaticCount(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticCount sc1 = new StaticCount();
        StaticCount sc2 = new StaticCount();
        StaticCount sc3 = new StaticCount();
    }
}
