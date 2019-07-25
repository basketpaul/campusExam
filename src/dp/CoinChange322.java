package dp;

import java.util.Arrays;

public class CoinChange322 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }

    //有问题
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        Arrays.sort(coins);
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0)
                dp[0][i] = i / coins[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                if (j == coins[i])
                    dp[i][j] = 1;
                else if (j < coins[i])
                    dp[i][j] = dp[i - 1][j];
                else if (dp[i][j] == 0 && dp[i - 1][j - coins[i]] != 0) {
                    dp[i][j] = dp[i - 1][j - coins[i]] + 1;
                } else if (dp[i - 1][j - coins[i]] != 0)
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i]] + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n - 1][amount];
    }

    public static int change(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        int[] dp = new int[amount + 1];
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (i == coin)
                    dp[i] = 1;
                else if (dp[i] == 0 && dp[i - coin] != 0)
                    dp[i] = dp[i - coin] + 1;
                else if (dp[i - coin] != 0)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
}
