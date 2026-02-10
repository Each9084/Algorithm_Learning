package JavaBase.array;

import java.util.Arrays;

public class twoDimensionalArray {
    public static void main(String[] args) {
        int [][] twoDimensional = { {1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23} };
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional.length; j++) {
                System.out.println(twoDimensional[i][j]);
            }
        }
    }
}
