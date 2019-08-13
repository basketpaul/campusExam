package beike;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int l = 1, h = n - 2;
        int ret = 0;
        while (l < h) {
            if (nums[l] > nums[l - 1] && nums[h] > nums[h + 1])
                continue;
            else if (nums[l] <= nums[l - 1]) {
                ret += (nums[l - 1] + 1 - nums[l]);
                nums[l] = nums[l - 1] + 1;
            } else if (nums[h] > nums[h - 1]) {
                ret += (nums[h + 1] + 1 - nums[h]);
                nums[h] = nums[h + 1] + 1;
            }
            l++;
            h--;
        }
        System.out.println(ret);
    }
}
