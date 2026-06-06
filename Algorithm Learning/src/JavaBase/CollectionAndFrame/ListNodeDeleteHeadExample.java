package JavaBase.CollectionAndFrame;

import Utils.ListNode;

public class ListNodeDeleteHeadExample {
    public static void main(String[] args) {
        ListNode head= ListNode.createLinkedList(new int[]{1,2,3,4,5});
        head = head.next;

    }
}
