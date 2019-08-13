package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNumber {
    public static void main(String[] args) {

    }

    private static String min(int[] numbers) {
        int n = numbers.length;
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        for (int j : list) {
            s += j;
        }
        return s;
    }


}
