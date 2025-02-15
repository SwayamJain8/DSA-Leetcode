class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int count = 0;

        for(int i = 0; i< nums.length; i++) {
            if(nums[i] < 0) {
                count++;
            }
        }

        if(count == nums.length) {
            for(int i = 0; i<nums.length; i++) {
                ms = Math.max(ms, nums[i]);
            }
        } else {
            for(int i = 0; i < nums.length; i++) {
                cs += nums[i];
                if(cs < 0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }
        }
        return ms;
    }
}