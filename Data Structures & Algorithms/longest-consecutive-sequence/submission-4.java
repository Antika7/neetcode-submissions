class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> numSet = new HashSet<>();

        for(int num : nums) {
            numSet.add(num);
        }

        int ctr = 0;
        int maxCtr = 0;

        for(int num : numSet) {
            
            ctr = 0;

            if(numSet.contains(num-1)) {
                continue;
            }

            int curr = num;
            while (numSet.contains(curr)) {
                ctr++;
                curr++;
            }
            if(ctr>maxCtr) {
                maxCtr = ctr;
            }
        }

        return maxCtr;
    }
}
