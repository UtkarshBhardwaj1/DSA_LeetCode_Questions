/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int a=mountainArr.length();
       int topElement=findTop(mountainArr);

       int window=search(mountainArr,0,topElement,target,true);
       if(window!=-1){
        return window;
       }
       return search(mountainArr,topElement+1,a-1,target,false);
    }
    static int findTop(MountainArray mountainArr){
        int left=0;
        int right=mountainArr.length()-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                //Top is to the right
                left=mid+1;
            }else{
                //Top is to the mid or left
                right=mid;
            }
        }
        //When both pointer at same element
        return left;
    }
    static int search(MountainArray mountainArr,int left,int right,int target,boolean win ){
        while(left<=right){
            int mid=left+(right-left)/2;
            int val=mountainArr.get(mid);

            if(val==target){
                return mid;
            }

            if(win){
                if(val<target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }else{
                if(val>target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
