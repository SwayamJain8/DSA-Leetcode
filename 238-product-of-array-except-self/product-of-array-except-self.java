class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int l[] = new int[n];
        int r[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                l[i] = 1;
            } else {
                l[i] = nums[i-1] * l[i-1];
            }
            if(n-1-i == n-1) {
                r[n-1-i] = 1;
            } else {
                r[n-i-1] = nums[n-i] * r[n-i];
            }
        }
        
        for(int i = 0; i < n; i++) {
            ans[i] = l[i] * r[i];
        }
        return ans;
    }
}