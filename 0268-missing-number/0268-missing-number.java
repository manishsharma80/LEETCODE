import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int data=0;
     int n=nums.length;
     int k=0;
     Arrays.sort(nums);
     for(int i =0;i<nums.length;i++){
        if(nums[i]!=k){
           return k;
        }
        k++;
     }   
     return k;
    }
}