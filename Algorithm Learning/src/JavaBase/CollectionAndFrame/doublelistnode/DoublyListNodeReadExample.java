package JavaBase.CollectionAndFrame.doublelistnode;

import Utils.DoublyListNode;

public class DoublyListNodeReadExample {
    public static void main(String[] args) {
        DoublyListNode head = DoublyListNode.createDoublyLinkedList(new int[]{1,2,3,4,5,6});
        DoublyListNode tail = null;

        System.out.println("正序:");
        for (DoublyListNode p =head; p!=null ; p = p.next) {

            System.out.print(p.val + " ");
            tail = p;
        }

        System.out.println();
        System.out.println();
        System.out.println("逆序:");
        for (DoublyListNode p = tail;  p != null ; p=p.prev) {

            System.out.print(p.val + " ");
        }
    }
}
