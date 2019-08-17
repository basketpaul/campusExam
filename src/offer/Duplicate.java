package offer;

import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {

    }

    private static boolean duplicate(int numbers[], int length, int[] duplication) {
        int[] tmp = new int[length];
        System.arraycopy(numbers, 0, tmp, 0, length);
        Arrays.sort(tmp);
        for (int i = 0; i < length - 1; i++) {
            if (tmp[i] == tmp[i + 1]) {
                duplication[0] = tmp[i];
                return true;
            } else
                duplication[0] = -1;
        }
        return false;
    }

    private static boolean duplicate2(int array[], int length, int[] duplication) {

        if (array == null) return false;

        // 判断数组是否合法（每个数都在0~n-1之间）
        for (int i = 0; i < length; i++) {
            if (array[i] < 0 || array[i] > length - 1) {
                return false;
            }
        }

        // key step
        for (int i = 0; i < length; i++) {
            while (i != array[i]) {
                if (array[i] == array[array[i]]) {
                    duplication[0] = array[i];
                    return true;
                }
                int temp = array[i];
                array[i] = array[array[i]];
                array[temp] = temp;
            }
        }

        return false;
    }
}
