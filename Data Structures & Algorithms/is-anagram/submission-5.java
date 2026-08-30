class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hm.containsKey(c)) {
                int val = hm.get(c);
                hm.put(c, ++val);
            } else {
                hm.put(c, 1);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(hm.containsKey(c)) {
                int val = hm.get(c);
                hm.put(c, --val);
                if(val == 0) {
                    hm.remove(c);
                }
            } else {
                hm.put(c, 1);
            }
        }
        if(hm.isEmpty()) {
            return true;
        }
        return false;
    }
}
