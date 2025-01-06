class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<=nums.length-1;i++) {
            for (int j=i+1;j<=nums.length-1;j++) {
                int x=j-i;
                if (nums[x]+nums[j]==target) {
                    return new int[]{x,j};
                }
            }
        }
    return null;
    }
}
