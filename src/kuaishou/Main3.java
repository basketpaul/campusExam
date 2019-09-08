package kuaishou;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] strs1 = str1.trim().split(" ");
        String[] strs2 = str2.trim().split(" ");
        int len1 = strs1.length - 1;
        int len2 = strs2.length - 1;
        int start1 = 0, start2 = 0;
        int cnt = 0;
        while (start1 <= len1 && start2 <= len2) {
            System.out.print(strs1[start1++] + " ");
            cnt++;
            if (cnt % 4 == 0)
                System.out.print(strs2[start2++] + " ");
        }
        if (start1 <= len1) {
            while (start1 <= len1) {
                System.out.print(strs1[start1++] + " ");
            }
        } else if (start2 <= len2) {
            while (start2 <= len2) {
                System.out.print(strs2[start2++] + " ");
            }
        }
    }
}
