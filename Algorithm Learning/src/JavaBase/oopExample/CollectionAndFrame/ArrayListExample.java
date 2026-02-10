package JavaBase.oopExample.CollectionAndFrame;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Benz");
        arrayList.add("Audi");

        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            System.out.println(s);
        }


        arrayList.remove(1);


        for (String i:arrayList
             ) {
            System.out.println(i);

        }

        arrayList.set(1,"Jeep");
        for (String s :arrayList
             ) {
            System.out.println(s);

        }


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("亚托克斯");
        linkedList.add("维鲁斯");
        linkedList.add("纳亚菲利");

        for (String s:linkedList
             ) {
            System.out.println(s);

        }

        linkedList.remove(2);

        for (String s:linkedList
             ) {
            System.out.println(s);

        }

        linkedList.add(2,"亚恒");

        for (String s:linkedList
             ) {
            System.out.println(s);
        }


        linkedList.set(2,"提莫");
        for (String s:linkedList
             ) {
            System.out.println(s);
        }


        arrayList.equals(null);
        System.out.println(arrayList.set(1,"Xpeng"));

    }
}
