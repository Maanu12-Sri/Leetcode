// Last updated: 2/13/2026, 11:24:05 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String p=strs[strs.length-1];
        int i=0;
        while(i<s.length()&&i<p.length()&&s.charAt(i)==p.charAt(i)){
        i++;}
        return s.substring(0,i);
    }
}