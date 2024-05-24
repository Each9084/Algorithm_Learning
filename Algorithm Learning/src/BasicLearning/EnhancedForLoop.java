package BasicLearning;

import java.util.*;
import java.util.function.Consumer;

public class EnhancedForLoop {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

    /*    Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }*/

       /* for (String s : list) {
            System.out.println(s);
        }*/

        /*list.forEach(s -> System.out.println(s));*/

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String next = it.next();
            if ("bbb".equals(next)) {
                it.add("qqq");
            }

        }
        System.out.println(list);
    }
}
