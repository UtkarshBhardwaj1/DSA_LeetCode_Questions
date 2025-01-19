class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0; 
        for(int pile:piles) {
            right=Math.max(right,pile);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            if(fn(piles,h,mid)){
                right=mid;  
            }else{
                left=mid+1; 
            }
        }
        return left; 
    }
    private boolean fn(int[] piles, int H, int K) {
        int hours=0;
        for(int pile:piles) {
            hours +=(pile+K-1)/K; 
        }
        return hours<=H;
    }
}
