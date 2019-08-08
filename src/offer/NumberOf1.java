package offer;

public class NumberOf1 {

    public static void main(String[] args) {
        System.out.println(numberOf1(2));
    }

    public static int numberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                cnt++;
            n = n >>> 1;//>>>无符号右移，>>相当于除二
        }
        return cnt;
    }
}
