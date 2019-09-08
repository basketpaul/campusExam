package bilibili;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            int w = weight[i - 1], v = value[i - 1];
            for (int j = 1; j <= m; j++) {
                if (j >= w) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[n][m]);

    }
}

