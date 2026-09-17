class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int lss = 0;
        while (i < s.length()) {
            HashSet<Character> set = new HashSet<>();
            int j = i;
            while (j < s.length() && !set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
            }
            lss = Math.max(lss, set.size());
            i++;
        }
        return lss;
    }
}
