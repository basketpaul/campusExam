package offer;

public class SwitchSpace {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello world");
        System.out.println(replaceSpace(str));
    }

    private static String replaceSpace(StringBuffer str) {
        int len = str.length();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                cnt++;
            }
        }
        char[] ret = new char[len + 2 * cnt];
        int pos = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                ret[pos++] = '%';
                ret[pos++] = '2';
                ret[pos++] = '0';
            } else {
                ret[pos++] = str.charAt(i);
            }
        }
        return String.valueOf(ret);
    }
}
