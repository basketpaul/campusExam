package offer;

import java.util.Arrays;

public class IsContinuous {
    public static void main(String[] args) {
        int[] numbers = {0, 3, 2, 6, 4};
        System.out.println(isContinuous(numbers));
    }

    private static boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return false;
        Arrays.sort(numbers);
        int cnt = 0;
        for (int num : numbers) {
            if (num == 0)
                cnt++;
        }
        int sub = 0;
        for (int i = cnt + 1; i < numbers.length; i++) {
            int tmp = numbers[i] - numbers[i - 1];
            if (tmp == 0)
                return false;
            else
                sub += tmp - 1;
        }
        if (sub <= cnt)
            return true;
        else
            return false;
    }
}
