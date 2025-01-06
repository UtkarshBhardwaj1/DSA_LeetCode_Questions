class Solution {
    public int mySqrt(int x) {
    if(x < 2) {
        return x; 
    }
    int left=0;
    int right=x;
    int result=0;

    while(left<=right){
        int mid=left+((right-left)/2); 
        long midSqr=(long)mid*mid;
        if(midSqr<=x){
            result=mid; 
            left=mid+1; 
        }else{
            right=mid-1; 
        }
    }
    return result; 
}
}
