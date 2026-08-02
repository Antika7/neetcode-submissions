class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0; // left pointer
        int r = 0; // right pointer
 
        int maxf = 0 ; // max frequency

        int res = 0; // window size
        
        HashMap<Character, Integer> count = new HashMap<>(); // to store count of frequency of each character in the current window

        for(r=0; r<s.length(); r++) {

            // update frequency of s[r]
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);

            // update max frequency if new count is more
            if(count.get(s.charAt(r)) > maxf) maxf = count.get(s.charAt(r));

            //check for invalid window
            while((r-l+1-maxf)>k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        

        return res;
    }
}
