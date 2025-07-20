class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
            if(x<0){
        return false;
      }
      else {
      String str =Integer.toString(x);
      for(int i=0;i<str.length()/2;i++){
          int j = str.length() - 1 - i;
        int dig =str.charAt(i)-'0';
         int dig2 = str.charAt(j) - '0';
        if(dig==dig2){
            a=0;
        }
        else {
            a++;
        }
        
        
      }
      if (a==0){
        return true;
      }
   
      else {
        return false;
      }
      }
    }
}