package three60;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] dp = new int[m + 1][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int last = dp[i - 1][j];
                dp[i][j] = Math.abs(last - d - n / 2) < Math.abs(last + d - n / 2) ? last - d : last + d;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (dp[m][i] >= 0 && dp[m][i] <= n)
                cnt++;
        }
        System.out.println(cnt);
    }
}
