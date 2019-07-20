package bytedance;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        caculate(n,a);
    }

    public static void caculate(int n,int[] a){
        Arrays.sort(a);
        int min = a[0];
        int[][] dp = new int[min][n];
        dp[0][0] = 1;
        for(int i = 1;i < n;i++){
            dp[0][i] = dp[0][i - 1] + a[i];
        }
        for(int i = 1;i < min;i++){
            if(a[0] % i == 0)
                dp[i][0] = a[0] / i;
        }
        for(int i = 2;i < min;i++){
            for(int j = 0;j < n;j++){
                if(a[j] % i == 0){
                    dp[i][j] = dp[i][j - i] + a[j] / i;
                }
            }
        }
        System.out.println(dp[min- 1][n - 1]);
    }
}


