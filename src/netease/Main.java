package netease;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] number = new int[151];
        for (int i = 0; i < n; i++) {
            number[arr[i]]++;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int question = sc.nextInt();
            double tmp = 0;
            for (int j = 0; j <= 150; j++) {
                if (j <= arr[question - 1])
                    tmp += number[j];
            }
            double result = (tmp - 1) / n * 100;
            System.out.println(String.format("%.6f", result));
        }
    }

}
