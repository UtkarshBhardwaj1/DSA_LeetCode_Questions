class Solution {
    public int[] productExceptSelf(int[] nums) {
        
	    int[] output=new int[nums.length];

	    output[0]=1;
	    for (int i=1;i<nums.length;i++) {
	        output[i]=nums[i-1]*output[i-1];
	    }
	    int temp=1;  
	    for(int j=nums.length-2;j>=0;j--) {
	        temp*=nums[j+1];
	        output[j]*=temp;
	    }
	    return output;
    }
}
