class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int lb = 1;
        int ub = 1;
        int k = 1;
        int mid = 1;
        
        for(int i=0; i<piles.length; i++){
            if(piles[i]>ub) ub = piles[i];
        }

        while(lb<=ub) {
            mid = (lb+ub)/2;

            long totalTime = 0;
            
            for(int p : piles) {
                totalTime += Math.ceil((double)p/mid);
            }

            if(totalTime<=h) {
                k = mid;
                ub = mid-1;
            }

            else {
                lb = mid+1;
            }

        }

        return k;
        
    }
}
