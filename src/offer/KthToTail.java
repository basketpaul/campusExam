package offer;

public class KthToTail {
    public static void main(String[] args) {

    }

    static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode tmp = head;
        int cnt = 0;
        while (tmp != null) {
            tmp = tmp.next;
            cnt++;
        }
        if (cnt < k)
            return null;
        ListNode node = head;
        while (k-- > 0) {
            node = node.next;
        }
        while (node != null) {
            node = node.next;
            head = head.next;
        }
        return head;
    }
}
