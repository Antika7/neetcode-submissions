class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0) return 0;

        int l = 0;
        int r = 1;
        HashSet<Character> charWindow = new HashSet<>();
        charWindow.add(s.charAt(l));
        int longestSubstring = 1;

        while(r<s.length()) {

            if(charWindow.contains(s.charAt(r))) {
                charWindow.remove(s.charAt(l));
                l++;
            }
            else {
                charWindow.add(s.charAt(r));
                longestSubstring = Math.max(longestSubstring, r - l + 1);
                r++;
            }
        }
        return longestSubstring;
    }
}
