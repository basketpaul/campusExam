package list;

public class SwapNodeInPairs24 {
    public static void main(String[] args) {

    }

    public static ListNode swapNodeInPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode ret = new ListNode(-1);
        ret.next = head;
        ListNode pre = ret;
        while (pre.next != null && pre.next.next != null) {
            ListNode l1 = pre.next, l2 = pre.next.next;
            ListNode next = l2.next;
            l1.next = next;
            l2.next = l1;
            pre.next = l2;
            pre = l1;
        }
        return ret.next;
    }
}
