class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long low=0,high=0;
        int counter=0;
        long sum=0;

        for(int item:nums)sum+=item;
        for(int i=0;i<n-1;i++){
            low+=nums[i];
            high=sum-low;
            if(low>=high)counter++;
        }
        return counter;
    }
}
