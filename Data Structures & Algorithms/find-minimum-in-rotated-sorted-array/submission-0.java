class Solution {
    public int findMin(int[] nums) {
        
        int l = 0;
        int r = nums.length-1;
        int mid=0;

        while(l<r) {
            mid = l+(r-l)/2;

            System.out.println("\nmid: "+ nums[mid]);
            System.out.println("l: "+ nums[l]);
            System.out.println("r: "+ nums[r]);

            if(nums[mid]>nums[r]) {
                l = mid+1;
                System.out.println("l=mid+1");
            }

            else {
                r = mid;
                System.out.println("r=mid");
            }
        }

        return nums[l];
    }
}
