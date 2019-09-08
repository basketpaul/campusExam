package tujia;

import java.util.*;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int R = sc.nextInt();
        int[][] dis = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dis[i], Integer.MAX_VALUE);
            dis[i][i] = 0;
        }

        int[] tar = new int[R + 1];
        for (int i = 1; i <= R; i++) {
            tar[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
            dis[x][y] = c;
            dis[y][x] = c;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (dis[i][k] != Integer.MAX_VALUE && dis[k][j] != Integer.MAX_VALUE) {
                        dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
                        dis[j][i] = dis[i][j];
                    }
                }
            }
        }
        dis[0][0] = 0;
        int s = 1 << R;
        int[][] dp = new int[s + 1][R + 1];
        for (int i = 0; i <= s; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for (int i = 1; i <= s; i++) {

            for (int j = 1; j <= R; j++) {
                if (((i >> j - 1) & 1) > 0) {

                    if (i == (1 << j - 1)) {
                        dp[i][j] = 0;
                    } else {

                        for (int k = 1; k <= R; k++) {
                            if (((i >> k - 1) & 1) > 0 && k != j) {
                                dp[i][j] = Math.min(dp[i ^ (1 << j - 1)][k] + dis[tar[k]][tar[j]], dp[i][j]);

                            }
                        }
                    }
                }
            }
        }

        int ret = Integer.MAX_VALUE;
        for (int i = 1; i <= R; i++) {
            ret = Math.min(ret, dp[(1 << R) - 1][i]);
        }
        System.out.println(ret);
    }
}