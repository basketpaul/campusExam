package dp;

public class NumArray303 {
    private int[] tmp = null;
    private int[] sum = null;

    public NumArray303(int[] nums) {
        if (nums != null && nums.length != 0) {
            tmp = nums;
            sum = new int[nums.length];
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        return sum[j] - sum[i] + tmp[i];
    }
}
