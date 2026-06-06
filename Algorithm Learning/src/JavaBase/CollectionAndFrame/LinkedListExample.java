package JavaBase.CollectionAndFrame;

import Utils.ListNode;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.offer("1");
        linkedList.offer("2");
        linkedList.offer("3");


        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);

        String first = linkedList.poll();

        System.out.println(first);
        linkedList.offer("4");
        System.out.println(linkedList.get(0));

        System.out.println(linkedList.contains("1"));

        System.out.println(linkedList);
        Iterator<String> iterator = linkedList.iterator() ;



        System.out.println("jiancha:"+linkedList.element());


        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            break;
        }

        System.out.println("======================");



        ListNode head = ListNode.createLinkedList(new int[]{1,2,3,4,5});
        System.out.println(head);

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = null;
        a.next = b;
        b.next = c;


        ListNode pointer = a;
        while(pointer!=null){
            System.out.println(pointer.val);
            pointer = pointer.next;
        }


        System.out.println("====================");

        ListNode cur = head;

        while (cur!=null){
            System.out.println(cur.val);
            System.out.println(cur.getVal());
            cur= cur.next;

        }


    }
}
