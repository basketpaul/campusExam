package wangyi;

import java.util.Scanner;

public class Main2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        int[] ret = new int[t];
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt(), m = sc.nextInt();
            if (k == 0)
                ret[i] = 30;
            else
                ret[i] = days(k, m);
        }
        for (int num : ret)
            System.out.println(num);
    }

    private static int days(int k, int m) {
        int[] days = new int[150];
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            days[tmp + 60] = 1;
        }
        for (int i = 61; i <= 90; i++) {
            boolean flag = true;
            if (days[i] == 1)
                continue;
            for (int j = i - k; j <= i + k; j++) {
                if (days[j] == 1) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                days[i] = 1;
        }
        int cnt = 0;
        for (int i = 61; i <= 90; i++) {
            cnt += days[i];
        }
        return cnt;
    }
}