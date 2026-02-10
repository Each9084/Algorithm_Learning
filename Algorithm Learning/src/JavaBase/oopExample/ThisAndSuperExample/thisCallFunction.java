package JavaBase.oopExample.ThisAndSuperExample;

public class thisCallFunction {

    thisCallFunction getReturn(){
        return this;
    }

     void method(){
         System.out.println("out");
     }



    public static void main(String[] args) {
        new thisCallFunction().getReturn().method();
        new thisCallFunction().method();
    }




}
