package list;

import java.util.ArrayList;
import java.util.List;

public class IsPalindromeLinkedList234 {

    public static void main(String[] args) {

    }

    public static boolean isParlindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int i = 0, j = list.size() - 1;
        while (i <= j) {
            if (!list.get(i).equals(list.get(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }


    //********************************
    //方法二
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null)
            slow = slow.next;
        cut(head, slow);
        return isEquals(head, reverse(slow));
    }

    private void cut(ListNode head, ListNode cutNode) {
        while (head.next != cutNode)
            head = head.next;
        head.next = null;
    }

    private ListNode reverse(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = newHead;
            newHead = head;
            head = nextNode;
        }
        return newHead;
    }

    private boolean isEquals(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val)
                return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}
