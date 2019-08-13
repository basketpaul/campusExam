package offer;

import java.util.HashMap;
import java.util.Map;

public class OnceNumber {
    public static void main(String[] args) {

    }

    private static void FindNumsAppearOnce(int[] array, int[] num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.keySet().contains(num)) {
                int times = map.get(num);
                times++;
                map.put(num, times);
            } else
                map.put(num, 1);
        }
        int[] ret = new int[2];
        int cnt = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == 1)
                ret[cnt++] = num;
        }
        num1[0] = ret[0];
        num2[0] = ret[1];
    }


    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        int length = array.length;
        if (length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int bitResult = 0;
        for (int i = 0; i < length; ++i) {
            bitResult ^= array[i];
        }
        int index = findFirst1(bitResult);
        for (int i = 0; i < length; ++i) {
            if (isBit1(array[i], index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }

    private int findFirst1(int bitResult) {
        int index = 0;
        while (((bitResult & 1) == 0) && index < 32) {
            bitResult >>= 1;
            index++;
        }
        return index;
    }

    private boolean isBit1(int target, int index) {
        return ((target >> index) & 1) == 1;
    }
}
