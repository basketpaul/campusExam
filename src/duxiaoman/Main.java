package duxiaoman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt();
        int[][] nums = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                nums[i][j] = (i * j) % 10;
            }
        }
        int ret = 0;
        for (int i = n; i >= n - a + 1; i--) {
            for (int j = m; j >= m - b + 1; j--) {
                ret += nums[i][j];
            }
        }
        System.out.println(ret);

//        int[][] newNums = new int[n - a + 1][m - b + 1];
//
//        for(int i = 0;i < n - a + 1;i++){
//            for(int j = 0;j < m - b + 1;j++){
//                int max = 0;
//                for(int x = i + 1;x <= i + a;x++){
//                    for(int y =  j + 1;y <= j + b;y++){
//                        max = Math.max(max,nums[x][y]);
//                    }
//                }
//                newNums[i][j] = max;
//            }
//        }

//        int ret = 0;
//        for(int i = 0;i < n - a + 1;i++){
//            for(int j = 0;j < m - b + 1;j++){
//                ret += newNums[i][j];
//            }
//        }
//        System.out.println(ret);
    }
}
