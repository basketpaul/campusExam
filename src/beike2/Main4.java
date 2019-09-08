package beike2;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        Arrays.sort(nums);
        int pos = 0;
        int sum2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (sum2 + nums[i] <= sum / 2) {
                sum2 += nums[i];
                pos = i;
            }
        }
        System.out.print(Math.abs(sum - sum2 - sum2));
        System.out.println(Math.abs(n - 1 - 1 - pos - pos));
    }
}
