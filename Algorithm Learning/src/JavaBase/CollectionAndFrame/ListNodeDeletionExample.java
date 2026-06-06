package JavaBase.CollectionAndFrame;

import Utils.ListNode;

public class ListNodeDeletionExample {
    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(new int[] {1,2,3,4,5,6});
        ListNode p = head;
        head.printList();

        for (int i = 0; i < 2; i++) {
            System.out.println("i:"+i + " val:"+p.getVal());
            p = p.next;
            System.out.println("经过p=p.next后现在的p的val是:"+p.getVal());
            System.out.println("==========next loop==============");
        }

        System.out.println("此时i=1达到最大跳出循环,p的val是:"+p.getVal());
        p.next = p.next.next;
        head.printList();
        p.printList();




    }
}
