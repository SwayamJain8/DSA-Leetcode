class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        helper(0, n-1, nums);
        helper(0, k-1, nums);
        helper(k, n-1, nums);
    }
    public void helper(int start, int end, int nums[]) {
        // for(int i = start; i< (start+end)/2; i++) {
        //     int temp = nums[i];
        //     nums[i] = nums[(start+end)-i-1];
        //     nums[(start+end)-i-1] = temp;
        // }
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp; 
            start++;
            end--;
        }
    }
}