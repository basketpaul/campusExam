package offer;

public class Bit {
    public static void main(String[] args) {
        System.out.println(printBit(45));
        System.out.println(reverse(456));
    }

    private static String printBit(int n) {
        return Integer.toBinaryString(n);
    }

    private static Integer reverse(int n) {
        //求补码
        return ~n + 1;
    }
}