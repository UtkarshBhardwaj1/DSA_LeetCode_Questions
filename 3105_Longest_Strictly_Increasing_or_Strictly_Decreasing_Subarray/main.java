class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int iLen=1,dLen=1,maxAns=1;
        for(int i=1;i<nums.length;i++){
             if(nums[i]>nums[i-1]){
                iLen++;
                dLen=1;
             }else if(nums[i]<nums[i-1]){
                dLen++;
                iLen=1;
             }else{
                iLen=1;
                dLen=1;
             }
             maxAns=max(iLen,dLen,maxAns);
        }
        return maxAns;
       
    }
    static int max(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}
