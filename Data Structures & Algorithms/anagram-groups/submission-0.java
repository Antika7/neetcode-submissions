// import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> ans = new HashMap<>();

        for(String s : strs)
        {

            int[] alphabets = new int[26];

            for(char ch : s.toCharArray())
            {
                alphabets[ch-'a']++;
            }

            String key = Arrays.toString(alphabets);

            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}