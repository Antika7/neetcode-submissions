class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> solution = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {

                int target = -(nums[i] + nums[j]);

                for (int k = j + 1; k < nums.length; k++) {
                    if (k != i && nums[k] == target) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }

        solution.addAll(set);
        return solution;
    }
}