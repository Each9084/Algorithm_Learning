package JavaBase.oopExample;

public class CopyConstructionValue {
    private String name;
    private int age;


    public CopyConstructionValue(String name, int age){
        this.name = name;
        this.age = age;
    }

    public CopyConstructionValue(){}
    public void printV(){
        System.out.println(name + "and" + age);
    }

    public static void main(String[] args) {
        CopyConstructionValue v1 = new CopyConstructionValue("neil",11);
        v1.printV();
        CopyConstructionValue v2 = new CopyConstructionValue();
        v2.name = v1.name;
        v2.age = v1.age+1;
        v2.printV();
    }






}
