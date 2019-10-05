package meituan1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sb.append("A");
            else if (flag) {
                sb.append("B");
                flag = false;
            } else {
                sb.append("C");
                flag = true;
            }
        }
        System.out.println(sb.toString());
    }
}
