package JavaBase.oopExample.InterfaceExample;

 interface Coach {
    void defend();
}


class Danny implements Coach{

    @Override
    public void defend() {
        System.out.println("注意BP");
    }
}

class TeacherMa implements Coach{

    @Override
    public void defend() {
        System.out.println("干就完了");
    }
}

class Homme implements Coach{

    @Override
    public void defend() {
        System.out.println("全体入侵对方f6");
    }
}

public class Demo{
    public static void defend(Coach coach){
        coach.defend();
    }


    public static void main(String[] args) {
        defend(new TeacherMa());
        defend(new Danny());
    }
}
