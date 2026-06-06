package JavaBase.CollectionAndFrame;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {


    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        System.out.println(queue);


        queue.poll();
        System.out.println(queue);


        String first = queue.poll();
        System.out.println(first);

        queue.offer("张三");
        System.out.println(queue);


        System.out.println(queue.peek());
        System.out.println(queue.contains("张三"));

        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.equals("张三")){
                System.out.println("找到了" + element);
                break;
            }

        }


        System.out.println("=================");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(1);
        pq.offer(5);

// 1. 看起来是乱的（这是堆的内部物理结构）
        System.out.println("直接打印：" + pq); // 可能是 [1, 10, 5]

// 2. 拿出来的永远是有序的（这才是真正的优先级体现）
        while (!pq.isEmpty()) {
            System.out.println("出队：" + pq.poll()); // 依次输出 1, 5, 10
        }



    }


}
