class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int l=0;
        int r=s1.length(); // window size = length of string s1
        String subs = "";

        char[] a = s1.toCharArray();
        Arrays.sort(a);

        char[] b;

        for(l=0; l<=s2.length()-s1.length(); l++) {
            subs = s2.substring(l, r); //substring in window
            b = subs.toCharArray();
            Arrays.sort(b);

            // compare characters in subs and s1
        
            if(Arrays.equals(a, b)) return true; // if matched return true
            
            r++; // otherwise increase window size
        }

        //when no match
        return false;
    }
}
