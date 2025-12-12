package JavaBase;

import java.util.Scanner;

public class throwExample {




    public static void divided(int a,int b){
        if (b == 0){
            throw new ArithmeticException("除数不能等于零");
        }

        System.out.println(a/b);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个整数 a: ");
       int first = sc.nextInt();

        // 提示用户并读取第二个整数
        System.out.print("请输入第二个整数 b: ");
        int numB = sc.nextInt();


        divided(first,numB);
    }


}
