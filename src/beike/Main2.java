package beike;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] tail = new int[n];
        int size = 0;
        for (int num : nums) {
            int left = 0;
            int right = size;
            while (left != right) {
                int mid = left + (right - left) / 2;
                if (tail[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            tail[left] = num;
            if (left == size)
                size++;
        }
        System.out.println(size);
    }
}
