package beike;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        long[] ret = new long[2];
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            long abs = Math.abs(nums[i + 1] - nums[i]);
            if (abs < min) {
                ret[0] = nums[i];
                ret[1] = nums[i + 1];
                min = abs;
            }
        }
        System.out.print(ret[0]);
        System.out.print(" ");
        System.out.print(ret[1]);
    }
}
