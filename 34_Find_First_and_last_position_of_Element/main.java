class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=window(nums,target,true);
        int b=window(nums,target,false);
        return new int[]{a,b};
        
    }
    static int window(int[] nums, int target, boolean turn){
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           start=(target>nums[mid])?mid+1:start;
           end=(target<nums[mid])?mid-1:end;
            if(target==nums[mid]){
            ans=mid;
            if(turn)end=mid-1;
            else start=mid+1;
            }
        }
        return ans;
    }
}
