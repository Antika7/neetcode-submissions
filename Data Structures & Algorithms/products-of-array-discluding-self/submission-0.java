class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod = 1;
        int ans[] = new int[nums.length];
        int ctr = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                prod = prod*nums[i];
            }
            else {
                ctr ++;
            }
        }

        System.out.println("prod = " + prod);

        if(ctr>1)
        {
            return new int[nums.length];
        }

        for(int i=0; i<nums.length; i++) {
            if(ctr>0)
            {
                ans[i] = (nums[i]==0) ? prod : 0 ;
                System.out.println("ans["+i+"] = " + ans[i]);
            }
            else {
                ans[i] = prod/nums[i] ;
            }
        }
        return ans;
    }
}  
