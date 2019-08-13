package offer;

public class FirstOnce {
    public static void main(String[] args) {

    }

    private static int firstonce(String str) {
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            arr[tmp]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
}
