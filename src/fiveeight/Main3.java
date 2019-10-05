package fiveeight;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = 1;
        }
        int[] last = new int[n];
        for (int i = 0; i < n; i++) {
            last[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            pre[i] = nums[i] > nums[i - 1] ? pre[i - 1] + 1 : 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            last[i] = nums[i + 1] > nums[i] ? last[i + 1] + 1 : 1;
        }
        int res = 1;
        for (int i = 1; i < n - 1; i++) {
            res = Math.max(res, pre[i]);
            res = Math.max(res, last[i]);
            if (nums[i + 1] - nums[i - 1] >= 2)
                res = Math.max(res, pre[i - 1] + last[i + 1] + 1);
        }
        System.out.println(res);
    }
}
