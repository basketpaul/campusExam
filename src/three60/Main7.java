package three60;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] d = new int[m];
        for (int i = 0; i < m; i++) {
            d[i] = sc.nextInt();
        }
        int l = 0, h = n - 1;
        for (int i = 0; i < m; i++) {
            if (l - d[i] >= 0) {
                l -= d[i];
            } else
                l += d[i];
            if (h + d[i] < n)
                h += d[i];
            else
                h -= d[i];
        }
        if (l >= 0 && l < n && h >= 0 && h <= n) {
            System.out.println(Math.abs(l - h) - 1);
        } else
            System.out.println(0);
    }
}
