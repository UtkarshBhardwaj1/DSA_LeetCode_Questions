class Solution {
    public int searchInsert(int[] input, int val) {
     if(input.equals(null)||input.length==0)return 0;
      //Binary Search O(log n)
		int left=0;
		int right=input.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(input[mid]==val)return mid; 	
			right=(val<input[mid])?mid-1:right;
			left=(val>input[mid])?mid+1:left;
		}
		return left; 
    }
}
