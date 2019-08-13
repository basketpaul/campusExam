package beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int ret = (n - 1) * (n) / 2;
        int l, h;
        int excep = 0;
        for (int i = 0; i < n; i++) {
            h = n - 1;
            while (nums[i] < 0.9 * nums[h]) {
                h--;
                excep++;
            }
        }
        ret -= excep;
        System.out.println(ret);
    }
}
