class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
          int data=0;
        if(nums.length<2){
            return 0;
        }
        else{

        int r=0;
      
       // for(int i =0;i<nums.length;i++){
            for(int i=1;i<nums.length;i++){
                r=nums[i]-nums[i-1];
                data=Math.max(data,r);

                        }            }
        
        return data ;
    }
}