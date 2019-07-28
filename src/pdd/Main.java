package pdd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String b = sc.nextLine();
        String[] arr = s.split(" ");
        String[] arrb = b.split(" ");
        int[] A = new int[arr.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.valueOf(arr[i]);
        }
        int[] B = new int[arrb.length];
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.valueOf(arrb[i]);
        }
        incNum(A, B);
    }

    private static void incNum(int[] A, int[] B) {
        if (A.length == 1)
            System.out.println(A[0]);
        else {
            int pos = 0;
            for (int i = 1; i < A.length; i++) {
                if (A[i] <= A[i - 1])
                    pos = i;
            }

            int max = Integer.MIN_VALUE;
            if (pos == 1) {
                for (int num : B) {
                    if (num < A[1] && num > max)
                        max = num;
                }
                if (max != Integer.MIN_VALUE) {
                    A[0] = max;
                }
            } else if (pos == 0) {
                for (int num : B) {
                    if (num > max && num < A[1])
                        max = num;
                }
            } else if (pos == A.length - 1) {
                for (int num : B) {
                    if (num > A[A.length - 2] && num > max)
                        max = num;
                }
            } else {
                for (int num : B) {
                    if (num > A[pos - 1] && num < A[pos + 1] && num > max)
                        max = num;
                }
            }
            if (max == Integer.MIN_VALUE)
                System.out.println("NO");
            else {
                A[pos] = max;
                for (int num : A) {
                    System.out.print(num + " ");
                }
            }

        }
    }
}
