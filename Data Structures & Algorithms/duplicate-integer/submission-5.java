class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int num: nums) {
            if(hm.get(num) > 1) {
                return true;
            }
        }
        return false;
    } 
}