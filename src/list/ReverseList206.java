package list;

public class ReverseList206 {
    public static void main(String[] args) {

    }

    public static ListNode reverse(ListNode head){
        ListNode newHead = new ListNode(-1);
        while(head != null){
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }


}
