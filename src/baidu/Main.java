package baidu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            map.put(x, y);
        }
        int cnt = 0;
        for (int num : map.keySet()) {
            while (num > m && map.get(num) != 0) {
                cnt++;
                map.put(num, map.get(num) - 1);
            }
        }
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int num : map.keySet()) {
            if (map.get(num) != 0)
                newMap.put(num, map.get(num));
        }
        int[] nums = new int[newMap.size()];
        int i = 0;
        for (int num : newMap.keySet()) {
            nums[i++] = num;
        }
        Arrays.sort(nums);
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            if (nums[l] + nums[h] < m)
                break;
            while (nums[l] + nums[h] >= m && newMap.get(nums[l]) != 0 && newMap.get(nums[h]) != 0) {
                newMap.put(nums[l], newMap.get(nums[l]) - 1);
                newMap.put(nums[h], newMap.get(nums[h]) - 1);
                cnt++;
            }
            if (newMap.get(nums[l]) == 0)
                l++;
            if (newMap.get(nums[h]) == 0)
                h--;

        }
        System.out.println(cnt);
    }
}
