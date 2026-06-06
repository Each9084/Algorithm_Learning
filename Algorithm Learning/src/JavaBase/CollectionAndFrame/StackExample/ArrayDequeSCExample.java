package JavaBase.CollectionAndFrame.StackExample;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeSCExample {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("赵大");
        arrayDeque.push("王二");
        arrayDeque.push("张三");


        // 获取栈顶元素(只是看一眼)
        String top = arrayDeque.peek();
        System.out.println("栈顶元素为：" + top); // 张三

        // 弹出栈顶元素(拿走后看一眼 此时最顶部的元素就消失了)
        String pop = arrayDeque.pop();
        System.out.println("弹出的元素为：" + pop); // 张三

        // 修改栈顶元素
        arrayDeque.pop();
        arrayDeque.push("李四");
        System.out.println(arrayDeque);//[李四, 赵大]

        // 遍历队列查找元素
        Iterator<String> iterator = arrayDeque.iterator();
        int index = -1;
        String target = "赵大";
        while (iterator.hasNext()) {
            String element = iterator.next();
            index++;
            if (element.equals(target)) {
                break;
            }
        }

        if (index == -1) {
            System.out.println("元素 " + target + " 不存在于队列中");
        } else {
            System.out.println("元素 " + target + " 在队列中的位置为：" + index);
        }

    }
}
