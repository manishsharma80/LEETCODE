
class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] rr =new int [nums.length];
        for (int a=0;a<nums.length;a++){
           // for(int j=0;j<rr.length;j++){
               rr[a]=nums[a]*nums[a];
            
        }
       Arrays.sort(rr);
        
        //for(int i=0;i<rr.length;i++){
        return rr;
    
    }
}