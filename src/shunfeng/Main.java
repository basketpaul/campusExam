package shunfeng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int tmp = sc.nextInt();
            caculate(tmp);
        }
    }

    private static void caculate(int q) {
        int ret;
        double max = 0;
        ret = q / 2 - 1;
        while (max < q) {
            ret++;
            if (ret % 2 == 0)
                max = 2 * (ret / 2 - 1);
            else
                max = 2 * (ret / 2 - 1) - 1.414;
        }
        System.out.println(ret);
    }
}
