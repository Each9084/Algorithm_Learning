package JavaBase.array;

import java.util.Arrays;

public class arrayPrintTwoDimensional {
    public static void main(String[] args) {
        String [][] twoDimensionalArray= new String [][] {{"宋江","吴用"},{"晁盖"}};
        System.out.println(Arrays.deepToString(twoDimensionalArray));

        String s1 = "1";
        String s2 = "2";

        System.out.println(s1.equals(s2));
    }
}
