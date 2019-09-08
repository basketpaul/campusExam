package huawei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int[] nums = new int[high];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i * i < high; i++) {
            if (nums[i] != 1) {
                for (int j = i * i; j < high; j += i) {
                    nums[j] = 1;
                }
            }
        }
        int ten = 0, one = 0;
        for (int i = low; i < high; i++) {
            if (nums[i] == 0) {
                one += i % 10;
                ten += (i / 10) % 10;
            }
        }
        if (ten > one)
            System.out.println(one);
        else
            System.out.println(ten);
    }
}
