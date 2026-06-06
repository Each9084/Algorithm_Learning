package Utils;

public class DoublyListNode {
    public int val;
    public DoublyListNode next, prev;

    public DoublyListNode(int x) {
        val = x;
    }

    public void printList(){

        DoublyListNode p = this;
        while (p!=null){
            if (p.next!=null){
                System.out.print(p.val+"->");
            }else{
                System.out.println(p.val+"->null");
            }


            p = p.next;
        }
    }

    public static DoublyListNode createDoublyLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        DoublyListNode head = new DoublyListNode(arr[0]);
        DoublyListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            DoublyListNode newNode = new DoublyListNode(arr[i]);
            cur.next = newNode;
            newNode.prev = cur;
            cur = cur.next;
        }
        return head;
    }
}
