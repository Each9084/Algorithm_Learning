package JavaBase.oopExample.InterfaceExample;

interface Coach3{
    void command();
}

interface CoachFactory{
    Coach3 createCoach();
}


class ACoach implements Coach3{


    @Override
    public void command() {
        System.out.println("我是A级证书教练");
    }
}

class ACoachFactory implements CoachFactory{

    @Override
    public Coach3 createCoach() {
        return new ACoach();
    }
}

class CCoach implements Coach3{

    @Override
    public void command() {
        System.out.println("我是C级证书教练");
    }
}

class CCoachFactory implements CoachFactory{

    @Override
    public Coach3 createCoach() {
        return new CCoach();
    }
}


public class Demo3 {

    public static void create(CoachFactory factory){
        factory.createCoach().command();
    }


    public static void main(String[] args) {
        create(new ACoachFactory());
        create(new CCoachFactory());
    }


}
