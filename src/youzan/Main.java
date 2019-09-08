package youzan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("\\|");
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        String[] tmp1 = strs[0].split(",");
        String[] tmp2 = strs[1].split(",");


        for (int i = 0; i < tmp1.length; i++) {
            list1.add(Integer.valueOf(tmp1[i]));
        }
        for (int i = 0; i < tmp2.length; i++) {
            list2.add(Integer.valueOf(tmp2[i]));
        }

        int size1 = list1.size();
        int size2 = list2.size();
        int[] ret = new int[size1 + size2];
        int pos = 0;
        for (int i = 0; i < list1.size(); i++) {
            ret[pos++] = list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            ret[pos++] = list2.get(i);
        }
        Arrays.sort(ret);
        int[] r = new int[ret.length];
        int p = 0;
        int pre = 0;
        for (int i = 0; i < ret.length; i++) {
            if (ret[i] != r[pre]) {
                r[p++] = ret[i];
                pre = p - 1;
            }
        }
        for (int i = 0; i < p; i++) {
            System.out.print(r[i] + " ");
        }
    }
}
