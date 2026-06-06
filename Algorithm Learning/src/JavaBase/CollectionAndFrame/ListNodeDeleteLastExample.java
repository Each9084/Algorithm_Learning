package JavaBase.CollectionAndFrame;

import Utils.ListNode;

public class ListNodeDeleteLastExample {

    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(new int[]{1,2,3,4,5,6});
        ListNode p = head;

        while (p.next.next!=null){
            p = p.next;
        }
        p.next = null;
        p.printList();
        head.printList();

    }


}
