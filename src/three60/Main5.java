package three60;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] ret = new int[256];
        for (int i = 0; i < str.length(); i++) {
            ret[str.charAt(i)]++;
        }
        int max = 0;
        for (int aRet : ret) {
            if (max < aRet)
                max = aRet;
        }
        System.out.println(max);
    }
}
