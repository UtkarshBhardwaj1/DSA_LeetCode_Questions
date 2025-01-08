//Using pointers
class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int left=0;
		for(int right=0;right<nums.length-1;right++) {
			if(nums[right]<nums[right+1]) {
				left=right+1;
			}else break;
		}
		return left;
    }
}
