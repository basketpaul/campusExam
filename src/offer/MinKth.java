package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MinKth {
    public static void main(String[] args) {

    }

    private static ArrayList<Integer> min(int[] input, int k) {
        if (k > input.length) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
}
