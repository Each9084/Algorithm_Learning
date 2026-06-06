package JavaBase.CollectionAndFrame.doublelistnode;

import Utils.DoublyListNode;

public class DoublyListNodeDeletionTopExample {
    public static void main(String[] args) {
        DoublyListNode head = DoublyListNode.createDoublyLinkedList(new int[]{1,2,3,4,5,6});
        DoublyListNode toDelete = head;

        head = head.next;
        head.printList();

        toDelete.prev = null;
    }
}
