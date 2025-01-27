class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxArea=0;

        while(low<high){
            int diff=high-low;
            int curHeight=Math.min(height[low],height[high]);
            int curArea=diff*curHeight;
            maxArea=Math.max(maxArea,curArea);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }
}
