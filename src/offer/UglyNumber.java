package offer;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(ugly(10));
    }

    private static int ugly(int index) {
        if (index <= 0)
            return 0;
        if (index == 1)
            return index;
        int[] arr = new int[index];
        arr[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < index; i++) {
            int next2 = arr[i2] * 2, next3 = arr[i3] * 3, next5 = arr[i5] * 5;
            arr[i] = Math.min(next2, Math.min(next3, next5));
            if (arr[i] == next2)
                i2++;
            if (arr[i] == next3)
                i3++;
            if (arr[i] == next5)
                i5++;
        }
        return arr[index - 1];
    }


}
