package dp;
/*
* 每次可以爬1/2阶,一共n阶
*
* */
public class ClimingStairs70 {
    public static void main(String[] args) {

    }

    public static int climb(int n ){
        if(n <= 2)
            return n;
        int pre1 = 1,pre2 = 2,ret = 0;
        for(int i = 3;i <= n;i++){
            ret = pre1 + pre2;
            pre1 = pre2;
            pre2 = ret;
        }
        return ret;
    }

    public static int climbing(int n){
        if(n <= 2)
            return n;
        int[] dp = new int[n];
        dp[0] = 1;dp[1] = 2;
        for(int i = 2;i < n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}
