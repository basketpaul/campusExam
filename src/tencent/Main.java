package tencent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] all = new int[n];
        for (int i = 0; i < n; i++) {
            all[i] = sc.nextInt();
        }
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            if (i == 0) {
                cnt += right(all, i);
            } else if (i == n - 1)
                cnt += left(all, i);
            else
                cnt = cnt + left(all, i) + right(all, i);
            ret[i] = cnt + 1;
        }
        for (int num : ret) {
            System.out.print(num + " ");
        }
    }

    private static int left(int[] all, int cur) {
        int max = all[cur - 1];
        int cnt = 0;
        while (cur >= 1) {
            if (all[cur - 1] >= max) {
                cnt++;
                max = all[cur - 1];
            }
            cur--;
        }
        return cnt;
    }

    private static int right(int[] all, int cur) {
        int max = all[cur + 1];
        int cnt = 0;
        while (cur <= all.length - 2) {
            if (all[cur + 1] >= max) {
                cnt++;
                max = all[cur + 1];
            }
            cur++;
        }
        return cnt;
    }

}
