package dp;

public class HouseRobber198 {
    public static void main(String[] args) {

    }

    public static int rob(int[] nums){
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int[] dp = new int[nums.length];
        //*********************************
        dp[0] = nums[0];dp[1] = Math.max(nums[1],nums[0]);

        for(int i = 2;i < nums.length;i++){
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }

    public static int rob2(int[] nums){
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int pre1 = 0,pre2 = 0;
        for(int i = 0;i < nums.length;i++){
            int max = Math.max(pre1 + nums[i],pre2);
            pre1 = pre2;
            pre2 = max;
        }
        return pre2;
    }
}
