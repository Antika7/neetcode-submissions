class Solution {
    public int search(int[] nums, int target) {
        
        int lowerIndex = 0;
        int upperIndex = nums.length-1;
        int midIndex;

        while(lowerIndex<=upperIndex) {

            midIndex = (int)((upperIndex+lowerIndex)/2);

            if(nums[midIndex] == target) {
                return midIndex;
            }

            if(nums[midIndex]<target) { lowerIndex = midIndex+1; }

            else if(nums[midIndex]>target) { upperIndex = midIndex-1; }
        }

        return -1;
    }
}
