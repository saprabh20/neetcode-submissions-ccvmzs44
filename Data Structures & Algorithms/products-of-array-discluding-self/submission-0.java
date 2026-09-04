class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] left = new int[n];
        left[0] = 1;
        int[] right = new int[n];
        right[n - 1] = 1;
        int prodl = 1;
        for (int i = 1; i < n; i++) {
            prodl *= nums[i - 1];
            left[i] = prodl;
        }
        int prodr = 1;
        for (int i = n - 2; i >= 0; i--) {
            prodr *= nums[i + 1];
            right[i] = prodr;
        }
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
