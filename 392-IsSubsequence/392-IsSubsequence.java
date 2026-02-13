// Last updated: 2/13/2026, 11:23:37 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
         while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
       if (i == s.length()) return true;
        return false;
        
    }
}