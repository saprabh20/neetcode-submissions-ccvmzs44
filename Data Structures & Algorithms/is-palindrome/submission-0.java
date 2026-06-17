class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (j > i) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            while (i < j && !((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
                i++;
                a = Character.toLowerCase(s.charAt(i));
            }
            while (i < j && !((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                j--;
                b = Character.toLowerCase(s.charAt(j));
            }
            if (a != b) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
