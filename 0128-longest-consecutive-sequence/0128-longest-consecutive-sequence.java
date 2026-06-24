class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        int maxCount = 1;
        int count = 1;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                continue;
            }

            if(nums[i + 1] - nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return Math.max(maxCount, count);
    }
}