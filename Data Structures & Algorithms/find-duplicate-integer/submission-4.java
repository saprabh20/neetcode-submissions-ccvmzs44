class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(fast < nums.length) {
            slow = nums[slow];
            // System.out.println("slow:" + slow);
            fast = nums[fast];
            // System.out.println("fast:" + fast);
            fast = nums[fast];
            // System.out.println("fast:" + fast);
            if(slow == fast) {
                break;
            }
        }    
        int slow1 = 0;
        while(slow != slow1) {
            slow = nums[slow];
            slow1 = nums[slow1];
        } 
        return slow;
    }
}
