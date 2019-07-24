package dp;

public class PartitionEqualSubsetSum416 {
    public static void main(String[] args) {

    }

    public static boolean canPartion(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        if (sum % 2 == 1)
            return false;
        int n = nums.length, c = sum / 2;
        boolean[][] dp = new boolean[n][c + 1];
        for (int i = 0; i <= c; i++) {
            if (i != nums[0])
                dp[0][i] = false;
            else
                dp[0][i] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= c; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i] <= j) {
                    dp[i][j] = dp[i - 1][j] || (j - nums[i] > 0 && dp[i - 1][j - nums[i]]);
                }
            }
        }
        return dp[n - 1][c];
    }
}
