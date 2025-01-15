class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int x=nums1.length;
        int y=nums2.length;
        int low=0,high=x;

        while(low<=high){
            int winX=(low +high)/2; 
            int winY = (x + y+1)/2 -winX;

            int maxX = (winX ==0) ? Integer.MIN_VALUE :nums1[winX -1];
            int minX = (winX ==x) ? Integer.MAX_VALUE :nums1[winX];
            int maxY = (winY ==0) ? Integer.MIN_VALUE :nums2[winY -1];
            int minY = (winY ==y) ? Integer.MAX_VALUE :nums2[winY];

            if (maxX <= minY && maxY <= minX) {
                if ((x + y) % 2 == 0) {
                    return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double) Math.max(maxX, maxY);
                }
            }
            else if (maxX > minY) {
                high = winX - 1;
            }
            else {
                low = winX + 1;
            }
        }
        return -1;
    }
}
