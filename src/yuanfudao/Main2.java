package yuanfudao;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int[] nums = new int[t];
            for (int j = 0; j < t; j++) {
                nums[j] = sc.nextInt();
            }
            ret[i] = func(t, nums);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ret[i]);
        }
    }

    public static int func(int t, int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3)
            return 0;
        else {
            int ret = 0;
            for (int i = nums.length - 3; i >= 0; i -= 3) {
                ret += nums[i];
            }
            return ret;
        }
    }
}
