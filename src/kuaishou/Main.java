package kuaishou;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        int m = Integer.parseInt(tmp);
        String[] strs = new String[m];
        for (int i = 0; i < m; i++) {
            strs[i] = sc.nextLine();
        }
        int[] ret = new int[m];


        for (int i = 0; i < m; i++) {
            String str1 = strs[i].split(" ")[0];
            String str2 = strs[i].split(" ")[1];
            String[] num1 = str1.split("\\.");
            int end1 = num1.length - 1;
            String[] num2 = str2.split("\\.");
            int end2 = num2.length - 1;

            while (num1[end1].equals("0")) {
                end1--;
            }
            while (num2[end2].equals("0")) {
                end2--;
            }
            StringBuilder sb1 = new StringBuilder();
            for (int j = 0; j <= end1; j++) {
                sb1.append(num1[j]);
            }
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j <= end2; j++) {
                sb2.append(num2[j]);
            }

            int n1 = Integer.parseInt(sb1.toString());
            int n2 = Integer.parseInt(sb2.toString());
            if (n1 >= n2)
                ret[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            if (ret[i] == 0)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
