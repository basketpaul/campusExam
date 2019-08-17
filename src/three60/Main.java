package three60;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] all = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                all[i][j] = sc.nextInt();
            }
        }
        int ret = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp = all[i][j];
                int left = i - 1 > 0 ? all[i - 1][j] : 0;
                int right = i + 1 < n ? all[i + 1][j] : 0;
                int up = j - 1 > 0 ? all[i][j - 1] : 0;
                int down = j + 1 < m ? all[i][j + 1] : 0;
                ret += (tmp - left) > 0 ? (tmp - left) : 0;
                ret += (tmp - right) > 0 ? (tmp - right) : 0;
                ret += (tmp - up) > 0 ? (tmp - up) : 0;
                ret += (tmp - down) > 0 ? (tmp - down) : 0;
            }
        }
        System.out.println(ret);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ret += all[i][j] == 0 ? 0 : 2;
            }
        }
        System.out.println(ret);
    }

}
