package JavaBase.CollectionAndFrame.doublelistnode;

import Utils.DoublyListNode;

public class DoublyListNodeInsertTailExample {
    public static void main(String[] args) {
        DoublyListNode head = DoublyListNode.createDoublyLinkedList(new int[]{1,2,3,4,5,6});
        DoublyListNode newNode = new DoublyListNode(7);
        DoublyListNode tail;
        for (tail=head; tail.next != null; tail = tail.next) {

        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode.printList();
        head.printList();
        tail = newNode;
        tail.printList();
    }
}
