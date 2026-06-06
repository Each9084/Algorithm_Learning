package JavaBase.CollectionAndFrame.doublelistnode;

import Utils.DoublyListNode;
import Utils.ListNode;

public class DoublyListNodeDeletionTailExample {
    public static void main(String[] args) {
        DoublyListNode head = DoublyListNode.createDoublyLinkedList(new int[]{1,2,3,4,5,6});
        DoublyListNode p = head;
        while (p.next!=null){
            p = p.next;
        }

        p.prev.next = null;
        p.prev = null;
        head.printList();



    }
}
