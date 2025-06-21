class Solution {
    public int countDigits(int num) {
        int a=0;
        int b=num;
        int c=0;
       String str = Integer.toString(num); 
       for (int i =0;i<str.length();i++){
        char ch = str.charAt(i);
        a = Character.getNumericValue(ch);
         
       if (a != 0 && b % a == 0){
         c++;   
        }
        //else if (b%b==0){
          //  c++;
        

       }
       return c;
    }
}