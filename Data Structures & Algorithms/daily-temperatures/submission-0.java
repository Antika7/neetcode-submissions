class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int result[] = new int[temperatures.length];
        Stack<int[]> st = new Stack<>();
        int[] pair;

        st.push(new int[]{temperatures[0], 0});

        for(int i=1; i<temperatures.length; i++) {
            while(!st.isEmpty() && temperatures[i]>st.peek()[0]) {
                pair = st.pop();
                result[pair[1]] = i-pair[1];
            }
            st.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
