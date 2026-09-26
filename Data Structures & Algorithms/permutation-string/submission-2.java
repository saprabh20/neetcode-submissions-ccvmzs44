class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2)
            return false;
        int[] s1count = new int[26];
        int[] s2count = new int[26];
        for (int i = 0; i < n1; i++) {
            s1count[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n1; i++) {
            s2count[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1count, s2count)) {
            return true;
        }
        int l = 0;
        for (int r = n1; r < n2; r++) {
            //remove l from array
            s2count[s2.charAt(l) - 'a']--;
            l++;
            //add r in the array
            s2count[s2.charAt(r) - 'a']++;
            if (Arrays.equals(s1count, s2count)) {
                return true;
            }
        }
        return false;
    }
}
