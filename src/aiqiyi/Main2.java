package aiqiyi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double ret = 0;
        double next = 1;

        while (m > 0) {
            ret += next * (double) n / (n + m);
            if (m >= 3) {
                next = next * (double) m / (n + m);
                m--;
                next = next * (double) m / (n + m);
                m--;
                next = next * (double) m / (n + m);
                m--;
            } else if (m == 2) {
                next = next * (double) m / (n + m);
                m--;
                next = next * (double) m / (n + m);
                m--;
                next = next * (double) n / (n + m);
                n--;
            } else {
                break;
            }

        }
        System.out.println(String.format("%.5f", ret));
    }
}
