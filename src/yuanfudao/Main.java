package yuanfudao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (map.containsKey(nums[i])) {
                int time = map.get(nums[i]);
                time++;
                map.put(nums[i], time);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) <= m)
                System.out.print(nums[i] + " ");
        }
    }
}
