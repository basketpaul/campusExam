package bytedance;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n /= 2;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        if (n < 3) {
            System.out.println(dp[n]);
        } else {
            for (int i = 3; i < n + 1; i++) {
                int cur = 0;
                for (int j = 0; j < i; j++) {
                    cur += dp[j] * dp[i - 1 - j];
                }
                dp[i] = cur;
            }
            System.out.println(dp[n] % 1000000007);
        }
    }


}
