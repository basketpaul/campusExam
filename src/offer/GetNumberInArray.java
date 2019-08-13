package offer;

public class GetNumberInArray {
    public static void main(String[] args) {

    }

    private static int getNumberOfK(int[] array, int k) {
        int cnt = 0;
        for (int num : array) {
            if (num == k)
                cnt++;
        }
        return cnt;
    }

    private static int getNumber(int[] array, double k) {
        int l = 0, h = array.length - 1;
        int pos;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (array[mid] < k)
                l = mid + 1;
            else if (array[mid] > k)
                h = mid - 1;
        }
        return l;//取k-0.5和k+0.5，相减
    }
}
