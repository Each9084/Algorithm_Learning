package JavaBase.CollectionAndFrame;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>();
        hashSet.add("league of legends");
        hashSet.add("Kingdom Come Deliverance");
        hashSet.add("MineCraft");

        System.out.println(hashSet.size());

        boolean isMcExist = hashSet.contains("MineCraft");
        System.out.println("MineCraft is " + isMcExist);


        Boolean isRemovedHashSet = hashSet.remove("league of legends");
        System.out.println("Removed league of legends ?" + isRemovedHashSet);

        boolean addElement = hashSet.add("Total War");
        System.out.println("Total War" + addElement);


        System.out.println("Modified HashSet: " + hashSet);

        System.out.println("======================");
        HashSet hashSet1 = new HashSet<>();
        hashSet1.add("1");
        hashSet1.add("2");
        hashSet1.add("3");
        hashSet1.add("4");

        System.out.println(hashSet1.size());


    }
}
