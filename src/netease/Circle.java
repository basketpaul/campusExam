package netease;

import java.util.Arrays;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            int[] arr = new int[q];
            for (int j = 0; j < q; j++) {
                arr[j] = sc.nextInt();
            }
            boolean flag = thisTime(arr, q);
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean thisTime(int[] arr, int q) {
        Arrays.sort(arr);
        if (arr[0] + arr[1] < arr[arr.length - 1])
            return false;
        return true;
    }
}
