package offer;

public class LeftRotateString {
    public static void main(String[] args) {
        String str = "abcXYZdef";
        System.out.println(leftRotateString(str, 3));
    }

    private static String leftRotateString(String str, int n) {
        int len = str.length();
        if (n > len)
            n %= len;
        String pre = str.substring(0, n);
        String post = str.substring(n, len);
        return post + pre;
    }
}
