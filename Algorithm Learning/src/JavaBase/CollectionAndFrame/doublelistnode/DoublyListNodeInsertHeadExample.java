package JavaBase.CollectionAndFrame.doublelistnode;

import Utils.DoublyListNode;

public class DoublyListNodeInsertHeadExample {
    public static void main(String[] args) {
        DoublyListNode head = DoublyListNode.createDoublyLinkedList(new int[]{1,2,3,4,5,6});
        DoublyListNode newHead = new DoublyListNode(0);
        newHead.next = head;
        head.prev = newHead;
        head.printList();
        head = newHead;
        head.printList();
        newHead.printList();

    }
}
