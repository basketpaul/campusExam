package dp;

public class ArithmeticSlices413 {

    public static void main(String[] args) {

    }

    //dp表示以A[i]结尾的等差递增自区间的个数
    public static int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        int n = A.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2])
                dp[i] = dp[i - 1] + 1;
        }
        int total = 0;
        for (int cnt : dp)
            total += cnt;
        return total;
    }
}
