package JavaBase.CollectionAndFrame;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque();

        arrayDeque.add("1");
        arrayDeque.add("2");
        arrayDeque.add("3");

        arrayDeque.remove("2");
        System.out.println(arrayDeque);

        arrayDeque.add("4");
        System.out.println(arrayDeque);
        System.out.println("if 2 is till exist?" + arrayDeque.contains("2"));

    }
}
