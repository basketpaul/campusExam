package offer;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, -3));
    }

    public static double power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        boolean isNegetive = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegetive = true;
        }
        double square = base * base;
        int times = exponent / 2;
        int tmp = exponent % 2;
        double ret = 1;
        while (times > 0) {
            ret *= square;
            times--;
        }
        while (tmp > 0) {
            ret *= base;
            tmp--;
        }
        if (isNegetive)
            return 1 / ret;
        else
            return ret;
    }
}
