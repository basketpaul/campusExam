package beike2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        boolean flag = false;
        char tmp = sb.charAt(0);
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) != tmp) {
                flag = true;
            }
        }
        if (!flag) {
            sb.append(tmp);
            System.out.println(sb.toString());
        } else {
            for (int i = 0; i < k - 1; i++) {
                sb.append(t);
            }
            int i = t.length() - 1;
            while (i < sb.length() - 1) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.deleteCharAt(i + 1);
                } else {
                    i++;
                }
            }
            System.out.println(sb.toString());
        }


    }
}
