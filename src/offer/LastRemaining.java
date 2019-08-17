package offer;

import java.util.ArrayList;
import java.util.LinkedList;

public class LastRemaining {
    public static void main(String[] args) {

    }

    private static int lastRemaining(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int tmp = 0;
        while (list.size() > 1) {
            tmp = (tmp + m - 1) % list.size();
            list.remove(tmp);
        }
        return list.size() == 1 ? list.get(0) : -1;
    }

    private static int last(int n, int m) {

        if (m == 0 || n == 0) {
            return -1;
        }
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int index = -1;
        while (data.size() > 1) {
            index = (index + m) % data.size();
            data.remove(index);
            index--;
        }
        return data.get(0);
    }

    private static int last2(int n, int m) {

        if (m <= 0 || n <= 0) {
            return -1;
        }
        //先构造循环链表
        ListNode head = new ListNode(0); //头结点, 值为0
        ListNode pre = head;
        ListNode temp = null;
        for (int i = 1; i < n; i++) {
            temp = new ListNode(i);
            pre.next = temp;
            pre = temp;
        }
        temp.next = head;//将第n-1个结点(也就是尾结点)指向头结点

        ListNode temp2 = null;
        while (n != 1) {
            temp2 = head;
            //先找到第m个结点的前驱
            for (int i = 1; i < m - 1; i++) {
                temp2 = temp2.next;
            }
            //删除第m个结点：将第m个结点的前驱指向第m个结点后面那个结点,temp2表示第m个结点的前驱
            temp2.next = temp2.next.next;
            head = temp2.next; //更新头结点
            n--;
        }

        return head.val;
    }
}
