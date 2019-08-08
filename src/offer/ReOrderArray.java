package offer;

public class ReOrderArray {
    public static void main(String[] args) {

    }

    static void reOrderArray(int[] array) {
        int[] tmp = array.clone();
        int n = array.length;
        int l = 0, h = n - 1;
        for (int i = 0; i < n; i++) {
            if (tmp[i] % 2 == 1)
                array[l++] = tmp[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            if (tmp[i] % 2 == 0)
                array[h--] = tmp[i];
        }
    }
}
