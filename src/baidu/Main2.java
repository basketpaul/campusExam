package baidu;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(caculate(n, k));
    }

    public static int caculate(int n, int k) {
        if (n - k <= 0)
            return 1;
        if (n - k == 1)
            return 1;
        if ((n + k) % 2 == 1)
            return 1;
        else
            return caculate((n + k) / 2, k) + caculate((n - (n + k) / 2), k);
    }
}
