package bilibili;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str == null)
            System.out.println(" ");
        if (str.trim().equals("")) {
            System.out.println(" ");
        }

        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = strs.length - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(strs[i]);
            } else {
                sb.append(strs[i]);
                sb.append(" ");
            }
        }
        String ret = sb.toString();
        System.out.println(ret);
    }
}
