class Solution {
    public int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length - 1;
        int area = 0;
        int maxArea = 0;
        int minHeight = 0;

        while(l<r) {
            minHeight = Math.min(heights[l], heights[r]);
            area = minHeight * (r-l);
            maxArea = area>maxArea ? area : maxArea;
            if(heights[l] > heights[r]) {
                r--;
            }
            else {
                l++;
            }
        }
        
        return maxArea;
    }
}
