package qianxin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tmp = null;
        if (sc.hasNextLine())
            tmp = sc.nextLine();
        int a = sc.nextInt(), b = sc.nextInt();
        String[] nums = tmp.split(" ");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> root = new ArrayList<>();
        root.add(Integer.valueOf(nums[0]));
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a == Integer.valueOf(nums[i]))
                left = i;
            if (b == Integer.valueOf(nums[i]))
                right = i;
        }
        System.out.println(nums[(left + right) % 2]);
    }
}

