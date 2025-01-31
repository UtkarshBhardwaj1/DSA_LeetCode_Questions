class Solution {
    public int[] minOperations(String boxes) {
        int size=boxes.length();
        int[]oprs=new int[size];

         int count=0,moves=0;
        for(int i=0;i<size;i++){
            oprs[i]=moves;
            if(boxes.charAt(i)=='1'){
                count++;
            }
            moves+=count;
        }
        count=0;
        moves=0;
        for(int i=size-1;i>=0;i--){
            oprs[i]+=moves;
            if(boxes.charAt(i)=='1'){
                count++;
            }
            moves+=count;
        }
        return oprs;
    }
}
