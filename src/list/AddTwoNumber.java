package list;

public class AddTwoNumber {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumber(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode ret = new ListNode(-1);
        ListNode ans = ret;
        boolean flag = false;
        while(l1 != null || l2 != null){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int tmp = flag ? val1 + val2 + 1 : val1 + val2;
            if(tmp >= 10){
                tmp = tmp % 10;
                flag = true;
            }else
                flag = false;
            ListNode temp = new ListNode(tmp);
            ret.next = temp;
            ret = ret.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(flag)
            ret.next = new ListNode(1);
        return ans.next;
    }
}


class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
