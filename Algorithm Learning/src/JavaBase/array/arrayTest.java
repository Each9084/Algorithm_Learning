package JavaBase.array;

import java.util.Arrays;

class Student {
    String name;
    Student(String name) { this.name = name; }
}


public class arrayTest {
    // 这是一个简单的 POJO，没写 toString

    public static void main(String[] args) {
        Student[] students = {new Student("张三"), new Student("李四")};

        // 这里就会打印出地址了！因为 Student 类没重写 toString
        System.out.println(Arrays.toString(students));

        // 而这里依然是内容，因为 String 类官方重写过了
        String[] names = {"张三", "李四"};
        System.out.println(Arrays.toString(names));
    }
}
