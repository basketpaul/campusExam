package offer;

public class Fabonaci {
    public static void main(String[] args) {
        System.out.println(fibonaci(39));
    }

    private static int fibonaci(int n) {
        if (n == 0)
            return 0;
        int pre1 = 1, pre2 = 1;
        if (n <= 2)
            return 1;
        int ret = 0;
        for (int i = 3; i <= n; i++) {
            ret = pre1 + pre2;
            pre1 = pre2;
            pre2 = ret;
        }
        return ret;
    }
}
