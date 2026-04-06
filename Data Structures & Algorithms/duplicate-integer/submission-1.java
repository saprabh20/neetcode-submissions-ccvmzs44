class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicatesHm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(duplicatesHm.containsKey(nums[i])){
                int val = duplicatesHm.get(nums[i]);
                duplicatesHm.put(nums[i], ++val);
            }else {
                duplicatesHm.put(nums[i], 1);
            }
            if(duplicatesHm.get(nums[i]) > 1){
                return true;
            }
            // System.out.println(duplicatesHm);
        }
        return false;
    }
}