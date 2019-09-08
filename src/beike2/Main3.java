package beike2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int tmp1 = sc.nextInt();
            int tmp2 = sc.nextInt();
            map.put(tmp2, tmp1);
            arr[i] = tmp2;
        }
        int cnt = 0;
        int sum = 0;
        for (int num : arr) {
            while (map.get(num) > 0) {
                if (sum + num < m) {
                    cnt++;
                    sum += num;
                    int time = map.get(num);
                    time--;
                    map.put(num, time);
                } else {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
