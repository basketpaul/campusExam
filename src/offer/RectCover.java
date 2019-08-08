package offer;

public class RectCover {
    public static void main(String[] args) {

    }

    public static int rectCover(int target) {
        if (target <= 2)
            return target;
        int pre1 = 1, pre2 = 2;
        for (int i = 3; i <= target; i++) {
            int tmp = pre2;
            pre2 = pre2 + pre1;
            pre1 = tmp;
        }
        return pre2;
    }
}
