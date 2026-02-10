package JavaBase.stringExample;

import java.sql.SQLOutput;
import java.util.Objects;

public class equalExample {
    public static void main(String[] args) {
        String mangseng = new String("Champion");
        String jiaoyue = new String("Champion");

        System.out.println(mangseng.equals(jiaoyue));
        System.out.println(mangseng == jiaoyue);


        System.out.println(Objects.equals("neil","tony"));
        System.out.println(Objects.equals("neil",new String("n"+"eil")));
        System.out.println(Objects.equals(null,new String("n"+"eil")));

        System.out.println( Objects.equals(null,null));
        String a = null;
        a.equals("neil");
    }
}
