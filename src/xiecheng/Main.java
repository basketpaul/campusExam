package xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head, int m) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = new ListNode(-1);
        ListNode ret = pre;
        pre.next = head;
        ListNode right = new ListNode(-1);
        ListNode righthead = new ListNode(-1);
        while (head != null) {
            if (head.val <= m) {
                head = head.next;
                pre = pre.next;
            } else {
                pre.next = pre.next.next;
                right.next = head;
                right = right.next;
                head = head.next;
                pre = pre.next;
            }
        }
        pre.next = righthead.next;
        return ret.next;
    }
    /* *****************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListNode head = null;
        ListNode node = null;
        int m = in.nextInt();
        while (in.hasNextInt()) {
            int v = in.nextInt();
            if (head == null) {
                node = new ListNode(v);
                head = node;
            } else {
                node.next = new ListNode(v);
                node = node.next;
            }
        }
        head = partition(head, m);
        if (head != null) {
            System.out.print(head.val);
            head = head.next;
            while (head != null) {
                System.out.print(",");
                System.out.print(head.val);
                head = head.next;
            }
        }
        System.out.println();
    }
}
