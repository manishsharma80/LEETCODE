class Solution {
    public int singleNumber(int[] nums) {
    int data=0;
    Arrays.sort(nums);
    if(nums.length<=1){
 
        return nums[0];
    }
    else{
      for(int i=0;i<nums.length-1;i+=2){
        //for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[i+1]){
                return nums[i];
    }
      }  
    }
    return nums[nums.length-1];
    }
}