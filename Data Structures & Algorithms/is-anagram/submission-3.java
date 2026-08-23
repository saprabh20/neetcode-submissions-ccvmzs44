class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm1.containsKey(c)) {
                int val = hm1.get(c);
                hm1.put(c, ++val);
            }
            else {
                hm1.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (hm2.containsKey(c)) {
                int val = hm2.get(c);
                hm2.put(c, ++val);
            }
            else {
                hm2.put(c, 1);
            }
        }

        if(hm1.equals(hm2)) {
            return true;
        }

        return false;
    }
}
