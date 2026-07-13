class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        int l = 0;
        int r = 0;
        int a = 0;

        HashSet<List<Integer>> result = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            a = nums[i];
            l = i + 1;
            r = nums.length -1 ;
            while(l<r) {
                int sum = a + nums[l] + nums[r];

                if(sum == 0) {
                    result.add(Arrays.asList(a, nums[l], nums[r]));
                    l++;
                    r--;
                }

                else if (sum<0) l++;

                else r--;
            }
            
        }

        return new ArrayList<>(result);
    }
}