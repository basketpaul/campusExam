package wangyi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            isReverse(arr[i]);
        }
    }

    private static void isReverse(int n) {
        String binary = Integer.toBinaryString(n);
        boolean ret = true;
        if (binary.length() == 1)
            System.out.println("Yes");
        else {
            int low = 0, high = binary.length() - 1;
            while (low < high) {
                if (binary.charAt(low) != binary.charAt(high))
                    ret = false;
                low++;
                high--;
            }
            if (ret)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
