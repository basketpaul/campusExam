package list;

public class MergeTwoSortedList21 {
    public static void main(String[] args) {

    }

    public static ListNode merge(ListNode l1,ListNode l2){
        if(l1 == null)  return l2;
        if(l2 == null) return l1;
        ListNode ret = new ListNode(-1);
        ListNode ans = ret;
        while(l1 != null || l2 != null){
            if(l1 == null){
                ret.next = l2;
                l2 = l2.next;
            }else if(l2 == null){
                ret.next = l1;
                l1 = l1.next;
            }else{
                if(l1.val >= l2.val){
                    ret.next = l2;
                    l2 = l2.next;
                }else{
                    ret.next = l1;
                    l1 = l1.next;
                }
            }
            ret = ret.next;
        }
        return ans.next;
    }
}
