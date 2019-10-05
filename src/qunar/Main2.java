package qunar;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int ret = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] > 0)
                    ret += nums[i][j];
                if (nums[i][j] > max)
                    max = nums[i][j];
            }
        }
        if (ret > 0)
            System.out.println(ret);
        else
            System.out.println(max);
    }
}
