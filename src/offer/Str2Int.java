package offer;

public class Str2Int {
    public static void main(String[] args) {

    }

    private static int str2Int(String str) {
        if (str.equals("") || str.length() == 0)
            return 0;
        int n = str.length();
        boolean flag = true;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '+' && i == 0)
                flag = true;
            else if (str.charAt(i) == '-' && i == 0)
                flag = false;
            else if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return 0;
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ret = ret * 10 + str.charAt(i) - '0';
            }
        }
        if (flag)
            return ret;
        else
            return -ret;
    }
}
