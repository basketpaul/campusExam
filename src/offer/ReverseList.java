package offer;

public class ReverseList {
    public static void main(String[] args) {

    }

    static ListNode reverse(ListNode head) {
        ListNode tmp = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = tmp;
            tmp = head;
            head = next;
        }
        return tmp;
    }
}
