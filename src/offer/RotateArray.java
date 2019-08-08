package offer;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(minNum(array));
    }

    public static int minNum(int[] array) {
        if (array.length == 0)
            return 0;
        int n = array.length;
        int l = 0, h = n - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (array[mid] > array[h]) {
                l = mid + 1;
            } else
                h = mid;
        }
        return array[l];
    }
}
