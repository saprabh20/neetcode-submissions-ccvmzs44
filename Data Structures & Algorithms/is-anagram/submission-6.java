class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            a[c - 'a']+=1;
        }
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            a[c - 'a']-=1;
        }
        for(int n : a) {
            if(n != 0) {
                return false;
            }
        }
        return true;
    }
}
