class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2)
            return false;
        HashMap<Character, Integer> s1count = new HashMap<>();
        HashMap<Character, Integer> s2count = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            s1count.put(s1.charAt(i), s1count.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < n1; i++) {
            s2count.put(s2.charAt(i), s2count.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (s1count.equals(s2count)) {
            return true;
        }
        int l = 0;
        for (int r = n1; r < n2; r++) {
            int lval = s2count.get(s2.charAt(l));
            if (lval == 1) {
                s2count.remove(s2.charAt(l));
            } else {
                s2count.put(s2.charAt(l), --lval);
            }
            l++;
            s2count.put(s2.charAt(r), s2count.getOrDefault(s2.charAt(r), 0) + 1);
            if (s1count.equals(s2count)) {
                return true;
            }
        }
        return false;
    }
}
