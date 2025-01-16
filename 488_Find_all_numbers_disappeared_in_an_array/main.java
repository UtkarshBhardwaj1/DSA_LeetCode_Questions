//Using hash set
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>(); 
        for(int num:nums) 
        { 
            set.add(num); 
        }  
        List<Integer> result=new ArrayList<>(); 
        for(int i=1;i<=nums.length;i++) 
        { 
            if(!set.contains(i)) 
            { 
                result.add(i); 
            } 
        } 
        return result;
    }
}


//Using cyclic sort
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       cSort(nums);

       List<Integer>list=new ArrayList<Integer>();
           
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=i+1){
            list.add(i+1);
        }
    } return list;      
    }
     
     public void cSort(int nums[]){
        int n=nums.length;
        int ind=0;
        while(ind<n){
            int ele=nums[ind];
            int corrPosition=ele-1;
            if(nums[ind]!=nums[corrPosition]){
                swap(nums,ind,corrPosition);

            }else{
                ind++;
            }
                    }
     }

     void swap(int input[],int index,int indexA){
        int temp=input[index];
        input[index]= input[indexA];
        input[indexA]=temp;
     }

}
