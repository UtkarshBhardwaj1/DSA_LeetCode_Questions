class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int nums_sum=0;
        for(int item:nums){
            nums_sum+=item;
        }
        return sum-nums_sum;
    }
}
