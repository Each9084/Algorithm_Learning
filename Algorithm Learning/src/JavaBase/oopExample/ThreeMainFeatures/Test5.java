package JavaBase.oopExample.ThreeMainFeatures;

class Mates{
    public void read(){
        System.out.println("同学们都爱读书");
    }

    public void write(){
        System.out.println("同学们都爱写题");
    }
}

class Student extends Mates{
    public void read(){
        System.out.println("这位同学喜欢读");
    }

    public void write(){
        System.out.println("这位同学喜欢写");
    }

}


public class Test5 {
    public static void main(String[] args) {
        Mates [] mates = {new Mates(),new Student()};

        ((Student) mates[1]).write();
        ((Student) mates[0]).write();


    }
}
