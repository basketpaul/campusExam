package offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThanHalf {
    public static void main(String[] args) {

    }

    private static int moreThanHalf(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.keySet().contains(num)) {
                int times = map.get(num);
                times++;
                map.put(num, times);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : map.keySet()) {
            if (2 * map.get(num) > array.length)
                return num;
        }
        return 0;
    }

    private static int more(int[] array) {
        Arrays.sort(array);
        int ret = array[0], times = 1;
        for (int i = 1; i < array.length; i++) {
            if (ret == array[i])
                times++;
            else if (ret != array[i] && times != 0) {
                times--;
            } else if (ret != array[i] && times == 0) {
                ret = array[i];
                times = 1;
            }
        }
        if (times == 0)
            return 0;
        else
            return ret;
    }
}
