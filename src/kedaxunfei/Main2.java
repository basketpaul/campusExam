package kedaxunfei;


public class Main2 {
    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17, 19, 21};
        int key = 19;
        int ret = find(nums, key, 0, nums.length - 1);
        System.out.println(ret + 1);
    }

    private static int find(int[] nums, int key, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low > high)
            return -1;
        if (key == nums[mid])
            return mid;
        else if (key > nums[mid])
            return find(nums, key, mid + 1, high);
        else
            return find(nums, key, low, mid - 1);
    }
}
