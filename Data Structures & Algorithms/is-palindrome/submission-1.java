class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (j > i) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));

            while (i < j && !Character.isLetterOrDigit(a)) {
                i++;
                a = Character.toLowerCase(s.charAt(i));
            }
            while (i < j && !Character.isLetterOrDigit(b)) {
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