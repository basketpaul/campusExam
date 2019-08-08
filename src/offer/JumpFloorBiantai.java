package offer;

public class JumpFloorBiantai {

    public static int jump(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * jump(target - 1);
        }
    }
}
