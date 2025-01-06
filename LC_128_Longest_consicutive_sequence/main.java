class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
		HashSet<Integer> set=new HashSet<>();
		for(int item:nums) {
			set.add(item);
		}
		
		for(int i:set) {
			if(!set.contains(i-1)) {
				int len=0;
				while(set.contains(i+len)) {
					len++;
				}
				longest=Math.max(len, longest);
			}
		}
		return longest;
    }
    

}
