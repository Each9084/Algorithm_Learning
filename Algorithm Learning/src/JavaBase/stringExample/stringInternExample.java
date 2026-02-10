package JavaBase.stringExample;

public class stringInternExample {
    public static void main(String[] args) {
        String s1 = new String ("neil");
        String s2 =s1.intern();
        System.out.println(s1==s2);

    }
}
