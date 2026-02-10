package JavaBase.oopExample;

public class Person {
    private String name;
    private String sex;
    private int age;


    public Person(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public static void main(String[] args) {
        Person xiaoxuesheng = new Person("haozi","male",10);
        xiaoxuesheng.name = "labuxiaoxin";
        xiaoxuesheng.sex = "male";
        xiaoxuesheng.age = 6;

        System.out.println(xiaoxuesheng.name);
        System.out.println(xiaoxuesheng.sex);
        System.out.println(xiaoxuesheng.age);


        Person hutao = new Person("hutao","famle",11);
        System.out.println(hutao.name);
        System.out.println(hutao.age);
        System.out.println(hutao.sex);
    }
}
