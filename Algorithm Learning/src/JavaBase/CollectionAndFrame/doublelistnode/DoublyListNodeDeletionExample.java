package JavaBase.CollectionAndFrame.doublelistnode;

import Utils.DoublyListNode;

public class DoublyListNodeDeletionExample {
    public static void main(String[] args) {
        DoublyListNode head = DoublyListNode.createDoublyLinkedList(new int[]{1,2,3,00,5,6,7});
        DoublyListNode p = head;
        for (int i = 0; i < 2; i++) {
            p = p.next;
        }
        DoublyListNode toDelete = p.next;
        DoublyListNode boundTest = toDelete.next;

        p.next = boundTest;
        if (boundTest != null){
            toDelete.next.prev = p;
        }


        toDelete.next = null;
        toDelete.prev = null;
        toDelete.printList();
        head.printList();
    }
}
