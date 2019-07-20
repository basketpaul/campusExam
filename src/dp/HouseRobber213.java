package dp;

public class HouseRobber213 {
    public static void main(String[] args) {

    }

    public static int rob(int[] nums){
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[1],nums[0]);
        return Math.max(rob(nums,0,nums.length - 2),rob(nums,1,nums.length - 1));
    }

    public static int rob(int[] nums,int start,int end){
        int pre2 = 0,pre1 = 0;
        for(int i = start;i <= end;i++){
            int max = Math.max(pre1 + nums[i],pre2);
            pre1 = pre2;
            pre2 = max;
        }
        return pre2;
    }
}
