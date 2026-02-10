package Utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void printList() {

        ListNode pointer = this;
        while (pointer != null) {
            System.out.print(pointer.val);
            if (pointer.next != null) {
                System.out.print("->");
            }else if (pointer.next==null){
                System.out.println("->NULL");
            }

            pointer = pointer.next;
        }

        System.out.println();
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }
}




