class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); // set of already seen numbers
        //HashSet is a set of unique elements
        for(int num : nums) {
            if(!set.add(num)) { //set.add(num) will return false if num is already in the set
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    } 
}