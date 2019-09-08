package beike2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        int ret = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += c[i];
            if (sum <= s)
                ret = i;
            else
                break;
        }
        System.out.println(ret + 1);
    }
}
