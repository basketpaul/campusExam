package offer;

import java.util.ArrayList;

public class ContinuesSequence {
    public static void main(String[] args) {

    }

    private static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

        int low = 1, high = 2;
        while (high > low) {
            int cur = (low + high) * (high - low + 1) / 2;

            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                ret.add(list);
                low++;
            } else if (cur < sum) {
                high++;
            } else
                low++;
        }
        return ret;
    }
}
