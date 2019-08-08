package offer;

public class MergeList {
    public static void main(String[] args) {

    }

    static ListNode merge(ListNode list1, ListNode list2) {
        ListNode ret = new ListNode(-1);
        ListNode head = ret;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                ret.next = list2;
                list2 = list2.next;
            } else {
                ret.next = list1;
                list1 = list1.next;
            }
            ret = ret.next;
        }
        while (list1 != null) {
            ret.next = list1;
            list1 = list1.next;
            ret = ret.next;
        }
        while (list2 != null) {
            ret.next = list2;
            list2 = list2.next;
            ret = ret.next;
        }
        return head.next;
    }
}
