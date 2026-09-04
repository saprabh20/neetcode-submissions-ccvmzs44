class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        int prodl = 1;
        int prodr = 1;
        for (int i = 1; i < n; i++) {
            prodl *= nums[i - 1];
            ans[i] = prodl;
        }
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * prodr;
            prodr *= nums[i];
        }
        return ans;
    }
}
