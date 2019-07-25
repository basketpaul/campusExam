package dp;

public class CoinChangeSecond518 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(coinChange(coins, 5));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount <= 0)
            return 0;
        if (coins == null || coins.length == 0)
            return 1;
        int n = coins.length;
        int[] dp = new int[amount + 1];
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (i == coin)
                    dp[i] += 1;
                else
                    dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
