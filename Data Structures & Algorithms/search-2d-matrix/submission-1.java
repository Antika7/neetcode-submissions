class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows=matrix.length-1;
        int cols=matrix[0].length-1;

        int l=0; // lower bound
        int r=rows;
        int mid=0;
        int m;

        //find the right row
        while(l<=r) {

            mid=l+(r-l)/2; //avoids overflow. It is same as m = (int)((l+r)/2);
            
            //target is smaller than the element in the first column of that row then search has to go to prev rows
            if(target<matrix[mid][0]) {
                r = mid-1;
            }

            //target is greater than the element in the last column of that row then search has to go to next rows
            else if(target>matrix[mid][cols]) {
                l = mid+1;
            }

            else break;
        }

        // Target is not present in any row's range
        if (l > r) {
            return false;
        }

        //find the right column

        int left = 0;
        int right = cols;
        
        while(left<=right) {
            m = left + (right - left) / 2; //avoids overflow. It is same as m = (int)((left + right)/2);

            if(matrix[mid][m] == target) return true;

            else if(matrix[mid][m] < target) left = m+1;

            else right = m-1;
        }

        return false;
        
    }
}
