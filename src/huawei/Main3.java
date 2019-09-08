package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        int n = Integer.parseInt(first, 16);

        String[] strs = new String[n];
        strs[0] = String.valueOf(n);
        for (int i = 1; i < n; i++) {
            strs[i] = String.valueOf(sc.next());
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            switch (strs[i]) {
                case "A":
                    list.add("12");
                    list.add("34");
                    break;
                case "B":
                    list.add("AB");
                    list.add("CD");
                    break;
                default:
                    list.add(strs[i]);
                    break;
            }
        }
        int cnt = list.size() + 1;

        System.out.print(Integer.toHexString(cnt) + " ");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                System.out.println(Integer.valueOf(list.get(i)));
            else
                System.out.print(list.get(i) + " ");
        }

    }
}
