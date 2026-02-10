package JavaBase.oopExample;

import java.util.Arrays;

public class varialeArgExample {


    public static void main(String[] args) {
        printVariableArg("n");
        printVariableArg("n"+"e");
        printVariableArg("n"+"e"+"i");
        printVariableArg("n"+"e"+"l");

        String [] strs = {"1","2"};
        Integer [] ints = {1,2,3};
        printOverload(ints);
        printOverload(strs.toString());
        printOverload(ints.toString());
        printOverload(Arrays.toString(ints));
    }


    public static void printVariableArg(String...arg){
        for (String element:arg
             ) {
            System.out.println("这个可变参数是: "+ element);
        }
    }

    public static void printOverload(String...strs){
        for (String element:strs
             ) {
            System.out.println(element);
        }
    }

    public static void printOverload(Integer...ints){
        for (Integer element : ints
                ) {
            System.out.println(element);
        }
    }


}
