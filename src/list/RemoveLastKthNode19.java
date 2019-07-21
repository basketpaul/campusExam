package list;

public class RemoveLastKthNode19 {
    public static void main(String[] args) {

    }

    public static ListNode removeLastKthNode(ListNode head,int n){
        ListNode pre = head,cur = new ListNode(-1),ret = cur;
        cur.next = pre;
        while(n > 0){
            pre = pre.next;
            n--;
        }
        while(pre != null){
            pre = pre.next;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return ret.next;
    }
}
