package JavaBase.oopExample.InterfaceExample;

public class CloneableTest {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException{
        CloneableTest c1 = new CloneableTest();
        CloneableTest c2 = (CloneableTest) c1.clone();
        System.out.println(c2==c1);

    }
}
