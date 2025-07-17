class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int val =0;
     //   int [] a=new int [arr.length];
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                val++;
             if(val==3) {
                return true; 
            }
            }
            else {
                val=0;
            }
        
        }
            return false ;
        
    }
}