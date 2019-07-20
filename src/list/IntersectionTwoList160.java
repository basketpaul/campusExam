package list;

public class IntersectionTwoList160 {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null)
            return null;
        ListNode l1 = headA,l2 = headB;
        while(l1.next != null){
            l1 = l1.next;
        }
        while(l2.next != null)
            l2 = l2.next;
        if(l1 != l2)
            return null;
        l1 = headA;
        l2 = headB;
        while(l1 != l2){
            l1 = l1.next == null ? headB : l1.next;
            l2 = l2.next == null ? headA : l2.next;
        }
        return l1;
    }
}
