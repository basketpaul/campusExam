package didi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] nums = new int[n + 1];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            set.add(a);
            set.add(b);
            nums[a] = b;
            nums[b] = a;
        }
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][i] = 1;
            for (int j = 1; j <= n; j++) {
                if (nums[i] != j && j != i)
                    dp[i][j] = 1;
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                int cnt = 0;
                for (int j = 1; j <= n; j++) {
                    cnt += dp[i][j];
                }
                max = Math.max(cnt, max);
            }
        }
        System.out.println(max);
    }
}
