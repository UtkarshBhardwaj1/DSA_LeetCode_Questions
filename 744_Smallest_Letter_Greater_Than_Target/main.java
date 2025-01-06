class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            end=(target<letters[mid])?mid-1:end;
            start=(target>=letters[mid])?mid+1:start;
        }
        return letters[start%letters.length];
    }
}
