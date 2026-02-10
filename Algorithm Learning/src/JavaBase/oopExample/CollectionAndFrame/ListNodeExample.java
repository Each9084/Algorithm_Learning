package JavaBase.oopExample.CollectionAndFrame;

import Utils.ListNode;

import java.util.List;

public class ListNodeExample {

    public static void main(String[] args) {
        ListNode headListNode = ListNode.createLinkedList(new int []{1,2,3,4,5});
        headListNode.printList();
        ListNode addListNode = new ListNode(0);
        addListNode.next = headListNode;

        headListNode = addListNode;
        headListNode.printList();

        ListNode lastListNode = headListNode;

        while (lastListNode.next!=null){
            lastListNode = lastListNode.next;
        }
        lastListNode.next = new ListNode(6);

        headListNode.printList();




    }


}
