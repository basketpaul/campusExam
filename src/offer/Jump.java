package offer;

public class Jump {
    public static int jumpFloor(int target) {
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
