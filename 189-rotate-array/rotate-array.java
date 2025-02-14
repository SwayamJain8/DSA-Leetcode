class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        helper(0, n, nums);
        helper(0, k, nums);
        helper(k, n, nums);
    }
    public void helper(int start, int end, int nums[]) {
            for(int i = start; i< (start+end)/2; i++) {
                int temp = nums[i];
                nums[i] = nums[(start+end)-i-1];
                nums[(start+end)-i-1] = temp;
            }
    }
}