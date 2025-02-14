class Solution {
    public int majorityElement(int[] nums) {
        int mE = nums[0];
        int vote = 1;
        for(int i = 1; i<nums.length; i++) {
            if(vote == 0) {
                mE = nums[i];
                vote++;
            } else if (nums[i] == mE) {
                vote++;
            } else {
                vote--;
            }
        }
        return mE;
    }
}