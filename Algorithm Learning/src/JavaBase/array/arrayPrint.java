package JavaBase.array;

import java.util.Arrays;

public class arrayPrint {




    public static void main(String[] args) {
        int [] newArray = {1,2,3};
        System.out.println("newArray.toString():");
        System.out.println(newArray.toString());
        System.out.println("newArray.getClass():");
        System.out.println(newArray.getClass());
        System.out.println("newArray.getClass().getName():");
        System.out.println(newArray.getClass().getName());

        String [] cmowers = {"沉默","王二","一枚有趣的程序员"};
        System.out.println(cmowers);


        String result = Arrays.toString(cmowers);
        System.out.println(result);
        System.out.println(Arrays.toString(cmowers));

    }
}
