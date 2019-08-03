package netease;

import java.util.Arrays;
import java.util.Scanner;

public class ArrFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            fix(arr, x);
        }
    }

    private static void fix(int[] arr, int x) {
        Arrays.sort(arr);
        int cnt = 0;
        int l = 0, h = arr.length - 1;
        int pos = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (l == h)
                pos = l;
            if (arr[mid] == x) {
                pos = mid;
                break;
            } else if (arr[mid] < x)
                l = mid + 1;
            else
                h = mid - 1;
        }
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] >= x) {
                arr[i]--;
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}