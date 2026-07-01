class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequencies
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Bucket sort
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = (List<Integer>[]) new ArrayList[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        // Result array
        int[] result = new int[k];
        k = k - 1;

        for (int i = nums.length; i >= 0 && k >= 0; i--) {
            for (int val : bucket[i]) {
                if (k < 0) break; 
                result[k--] = val;
            }
        }

        return result;
    }
}
