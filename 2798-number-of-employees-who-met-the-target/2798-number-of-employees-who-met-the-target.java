class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int b =0;
        int a=0;
      for(int i =0;i<hours.length;i++){
        if (target <= hours[i]){
            b++;
            a++;
           // System.out.println(target);
        }
       
      }  
      if(b!=0){
        return b;
      }
      else {
        return a;
      }
    }
}