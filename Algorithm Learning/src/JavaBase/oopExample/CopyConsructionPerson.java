package JavaBase.oopExample;

public class CopyConsructionPerson {
    private String name;
    private int age;

    public CopyConsructionPerson(String name,int age){
        this.name = name;
        this.age = age;
    }


    public CopyConsructionPerson(CopyConsructionPerson person){
        this.name = person.name;
        this.age = person.age;
    }


    public void out(){
        System.out.println("姓名 " + name +" 年龄 " + age);
    }

    public static void main(String[] args) {
        CopyConsructionPerson p1 = new CopyConsructionPerson("tom",12);
        p1.out();

        CopyConsructionPerson p2 = new CopyConsructionPerson(p1);
        p2.out();
    }



}
