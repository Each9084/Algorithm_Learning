package JavaBase.oopExample.CollectionAndFrame;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("1","neil");
        hashMap.put("2","tom");
        hashMap.put("3","tony");


        String value = hashMap.get("2");
        System.out.println(value);


        hashMap.put("1","NIO");
        System.out.println(hashMap.get("1"));


        hashMap.remove("2");

        for (String key:hashMap.keySet()
             ) {
            String v = hashMap.get(key);
            System.out.println(key + ": " + v);
        }


        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("沉默", "cenzhong");
        linkedHashMap.put("王二", "wanger");
        linkedHashMap.put("陈清扬", "chenqingyang");

// 遍历 LinkedHashMap
        for (String key : linkedHashMap.keySet()) {
            String v = linkedHashMap.get(key);
            System.out.println(key + " 对应的值为：" + v);
        }

        // 创建一个HashMap，插入的键值对为 沉默 王二 陈清扬
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("沉默", "cenzhong");
        hashMap2.put("王二", "wanger");
        hashMap2.put("陈清扬", "chenqingyang");

// 遍历 HashMap
        for (String key : hashMap2.keySet()) {
            String v = hashMap2.get(key);
            System.out.println(key + " 对应的值为：" + v);
        }




    }
}
