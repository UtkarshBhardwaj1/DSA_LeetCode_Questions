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

//Using binary search
class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int left=0;
        int right=nums.length-1;
		while(left<right) {
            int mid=left+(right-left)/2;
			if(nums[mid]>nums[mid+1]) {
				right=mid;
			}else {
                left=mid+1;
            }
		}
		return left;
    }
}
