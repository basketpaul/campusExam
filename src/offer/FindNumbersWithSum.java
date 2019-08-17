package offer;

import java.util.ArrayList;

public class FindNumbersWithSum {
    public static void main(String[] args) {

    }

    private static ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        int l = 0, h = array.length - 1;
        ArrayList<Integer> ret = new ArrayList<>();
        while (l < h) {
            if (array[l] + array[h] == sum) {
                if (ret.size() == 0) {
                    ret.add(array[l]);
                    ret.add(array[h]);
                } else if (array[l] * array[h] < ret.get(0) * ret.get(1)) {
                    ret.set(0, array[l]);
                    ret.set(1, array[h]);
                }
                l++;
                h--;
            } else if (array[l] + array[h] > sum) {
                h--;
            } else
                l++;
        }
        return ret;
    }
}
