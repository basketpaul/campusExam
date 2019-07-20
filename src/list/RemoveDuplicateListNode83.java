package list;

public class RemoveDuplicateListNode83 {
    public static void main(String[] args) {

    }

    public static ListNode remove(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode cur = head, next = head.next;
        while (cur != null && next != null) {
            while (next != null && cur.val == next.val) {
                cur.next = next.next;
                next = next.next;
            }
            cur = cur.next;
        }
        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
