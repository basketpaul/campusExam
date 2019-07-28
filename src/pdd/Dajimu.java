package pdd;

import java.util.Arrays;
import java.util.Scanner;

public class Dajimu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            L[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }
        dynamic(L, W);
    }

    private static void dynamic(int[] L, int[] W) {
        int maxL = 0;
        for (int l : L)
            maxL = Math.max(maxL, l);
        int[][] dp = new int[maxL + 1][];
    }

}
