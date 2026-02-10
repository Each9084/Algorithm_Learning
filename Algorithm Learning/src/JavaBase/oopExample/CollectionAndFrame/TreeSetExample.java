package JavaBase.oopExample.CollectionAndFrame;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");

        System.out.println(treeSet);
        treeSet.remove("2");
        System.out.println(treeSet);

        treeSet.remove("1");
        treeSet.add("4");
        System.out.println(treeSet);

        System.out.println(treeSet.contains("3"));
        System.out.println(treeSet.contains("1"));
    }
}
