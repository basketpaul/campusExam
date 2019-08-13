package offer;

public class NumberOf1From1ToN {
    public static void main(String[] args) {

    }

    private static int number(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1')
                    cnt++;
            }
        }
        return cnt;
    }
}
