package JavaBase.CollectionAndFrame;

import Utils.ListNode;

public class ListNodeTailExample {
    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(new int[]{1,2,3,4,5});
        ListNode p = head;
        for (int i = 0; i < 2; i++) {
            p = p.next;
        }

        ListNode newListNode = new ListNode(66);
        newListNode.next = p.next;

        p.next = newListNode;
        head.printList();

    }
}
