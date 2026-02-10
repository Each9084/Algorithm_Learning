package JavaBase.oopExample.InnerClassExample;

public class StaticInnerClassExample {
    static int age = 10;
    String name = "tom";

     class Example{
        public Example(){
            System.out.println(age);
            StaticInnerClassExample s =new StaticInnerClassExample();
            System.out.println(s.name);
        }
    }

}
