package JavaBase;

import java.io.IOException;
import java.net.Socket;

public class exceptionExample {
    public void checkAge(int age){
            if(age<18){
                throw new ArithmeticException("年纪未满 18 岁，禁止观影");
            }else {
                System.out.println("请认真观影!!");
            }

    }

    public static void main(String[] args) {
        exceptionExample example = new exceptionExample();
        example.checkAge(10);
    }
}
