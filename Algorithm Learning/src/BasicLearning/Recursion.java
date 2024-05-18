package BasicLearning;

import java.util.Scanner;

public class Recursion {

    private static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = Integer.parseInt(input);
        getSum(number);
        System.out.println(result);

    }

    public static int getSum(int number) {
        result = 0;
        if (number ==1) {
            return 1;
        }

        return result = number + getSum(number-1);
    }


}
