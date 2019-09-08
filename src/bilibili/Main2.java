package bilibili;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(",");
        int n = strs.length;
        Arrays.sort(strs, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        String ret = "";
        for (String s : strs) {
            ret += s;
        }
        System.out.println(ret);
    }
}
