class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = nums[0];

        for(int n : nums) {
            if(cs < 0) {
                cs = 0;
            }
            cs += n;
            ms = Math.max(ms, cs);
        }

        return ms;
    }
}