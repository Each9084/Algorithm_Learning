package JavaBase.CollectionAndFrame.ArrayListExampleList;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList  = new ArrayList<String>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");

        for(int i = 0;i< arrayList.size();i++){
            String s = arrayList.get(i);
            System.out.println(s);
        }


        arrayList.remove(1);
        for (String s : arrayList){
            System.out.println(s);
        }

        arrayList.remove("王五");
        for (String s:arrayList
             ) {
            System.out.println(s);
        }

        arrayList.set(0,"张飞");
        for (String s : arrayList
             ) {
            System.out.println(s);
        }

    }

}
