package tujia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), s = sc.nextInt(), t = sc.nextInt();
        int a = 0, b = 0;
        boolean flag = true;
        for (int i = 1; i <= t; i++) {
            a += 13;
            if (m >= 10) {
                m -= 10;
                b += 50;
            } else {
                m += 4;
            }
            a = Math.max(a, b);
            if (a >= s) {
                System.out.println("Yes");
                System.out.println(i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("No");
            System.out.println(a);
        }
    }
}
