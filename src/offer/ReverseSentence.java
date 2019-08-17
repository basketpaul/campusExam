package offer;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverse(" "));
    }

    private static String reverse(String str) {
        //trim()方法实际上trim掉了字符串两端Unicode编码小于等于32（\u0020）的所有字符。
        if (str.trim().equals(" "))
            return str;
        String[] sequence = str.split(" ");
        StringBuilder ret = new StringBuilder();
        for (int i = sequence.length - 1; i >= 0; i--) {
            ret.append(sequence[i]);
            if (i != 0)
                ret.append(" ");
        }
        return ret.toString();
    }
}
