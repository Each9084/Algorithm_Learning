package JavaBase.oopExample.InterfaceExample;

public class Computer implements Electronic{


    public static void main(String[] args) {
        Computer c = new Computer();
        c.printDescription();
    }

    @Override
    public int getElectricityUse() {
        return 0;
    }
}
