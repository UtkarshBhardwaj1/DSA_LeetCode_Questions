class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int item:nums){
            if(set.contains(item)){
                return true;
            }
            set.add(item);
        }
        return false;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        boolean result=false;
        for(int item:nums){
            set.add(item);
        }
        int len=nums.length;
        int len1=set.size();

        if(len1<len){
            result =true;
        }
        return result;
    }
}
