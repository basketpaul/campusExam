package offer;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(maxSubArray(array));
    }

    private static int maxSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int ret = max;
        for (int num : array) {
            if (max <= 0) {
                max = num;
            } else {
                max += num;
            }
            if (max > ret)
                ret = max;
        }
        return ret;
    }

    private static int max(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int n = array.length;
        int[] dp = new int[n];
        dp[0] = array[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        return max;
    }
}
