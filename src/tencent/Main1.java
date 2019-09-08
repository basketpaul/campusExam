package tencent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = 0, h = str.length() - 1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (l < h) {
            while (str.charAt(l) != '[') {
                l++;
            }
            while (str.charAt(h) != ']') {
                h--;
            }
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(l);
            tmp.add(h);
            l++;
            h--;
        }
        int times = list.size();
        StringBuilder ret = new StringBuilder();
        for (int i = times - 1; i >= 0; i--) {
            int left = list.get(i).get(0);
            int right = list.get(i).get(0);
            int pos = 0;
            for (int j = left; j <= right; j++) {
                if (str.charAt(j) == '|')
                    pos = j;
            }
            int n = (int) str.charAt(pos - 1);
            for (int m = 0; m < n; m++) {
                ret.append(str, pos + 1, right + 1);
            }
        }
    }
}
