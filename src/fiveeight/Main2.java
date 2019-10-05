package fiveeight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.trim().split(",");
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.valueOf(strs[i]);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], i);
            else
                map.put(arr[i], map.get(arr[i]) + 1);
        }
        int cnt = 0;
        for (int i : map.keySet()) {
            if (map.get(i) - 1 == i)
                cnt += map.get(i);
            else
                cnt += i;
        }
        System.out.println(cnt);
    }
}
