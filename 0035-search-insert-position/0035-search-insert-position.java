class Solution {
    public int searchInsert(int[] nums, int target) {
        int data =0;
     for(int a =0;a<nums.length;a++){
        if(nums[a]<target){
            data++;
        }
        
     }  
     return data; 
    }
}