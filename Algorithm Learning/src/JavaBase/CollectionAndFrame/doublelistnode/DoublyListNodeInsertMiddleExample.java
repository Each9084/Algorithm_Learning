package JavaBase.CollectionAndFrame.doublelistnode;

import Utils.DoublyListNode;

public class DoublyListNodeInsertMiddleExample {
    public static void main(String[] args) {
       DoublyListNode head = DoublyListNode.createDoublyLinkedList(new int[]{1,2,3,4,5,6});
       DoublyListNode newNode = new DoublyListNode(34);

       DoublyListNode p = head;
        for (int i = 0 ; i<2; i++) {
            p = p.next;
        }

        newNode.prev = p;
        newNode.next = p.next;


        p.next.prev = newNode;
        p.next = newNode;

        p.printList();
        head.printList();


    }
}
