package kuaishou;

import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            func(n);
        }
    }

    private static void func(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        int ret = 0;
        while (ret != 1) {
            ret = 0;
            while (n > 0) {
                ret += (n % 10) * (n % 10);
                n /= 10;
            }
            if (set.contains(ret)) {
                System.out.println("false");
                break;
            } else
                set.add(ret);
            n = ret;
        }
        if (ret == 1)
            System.out.println("true");
    }
}
