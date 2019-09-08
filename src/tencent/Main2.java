package tencent;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gym = new int[n];
        for (int i = 0; i < n; i++) {
            gym[i] = sc.nextInt();
        }
        int[] work = new int[n];
        for (int i = 0; i < n; i++) {
            work[i] = sc.nextInt();
        }
        int[] all = new int[n];
        for (int i = 0; i < n; i++) {
            if (gym[i] == 1 || work[i] == 1)
                all[i] = 1;
        }
        int pre1 = 0, pre2 = 0;
        for (int i = 1; i < n; i++) {
            int max = Math.max(pre2 + all[i], pre1);
            pre2 = pre1;
            pre1 = max;
        }
        System.out.println(pre1);
    }
}
