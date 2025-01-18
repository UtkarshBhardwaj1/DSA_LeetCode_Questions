class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
          //using switch
            switch(Integer.compare(target,nums[mid])){
                case 0:
                //Return 0 if target==nums[mid]
                    return mid;
                case 1:
                //Return 1 if target>num[mid]
                    low=mid+1;
                    break;
                case -1:
                //Return -1 if taget <nums[mid]
                    high=mid-1;
                    break;
            }
          //Or using if else
          if(target==array[mid]) 
          { 
            return mid; 
          }
          else if(target>array[mid]) 
          { 
            left=mid+1; 
          } 
          else 
          { 
            right=mid-1; 
          }
        }
        return -1;
    }
}
