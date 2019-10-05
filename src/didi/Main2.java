package didi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int preSum = nums[0] + nums[1] + nums[2];//i = 1
        int min = preSum;
        for (int i = 3; i < n - 1; i++) {
            preSum = nums[i] < 0 ? preSum + nums[i] : nums[i - 1] + nums[i - 2] + nums[i];
            min = Math.min(min, preSum);
        }
        System.out.println(min);
    }
}
