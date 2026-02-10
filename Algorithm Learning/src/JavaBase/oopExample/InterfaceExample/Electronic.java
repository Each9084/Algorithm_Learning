package JavaBase.oopExample.InterfaceExample;

public interface Electronic {
    String LED = "LED";
    //抽象方法
    int getElectricityUse();

    static boolean isEnergyEfficient(String electtronicType){
        return electtronicType.equals(LED);
    }

    default void printDescription(){
        System.out.println("电子");
    }

}
