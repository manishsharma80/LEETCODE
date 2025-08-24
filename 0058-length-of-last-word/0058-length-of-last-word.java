class Solution {
    public int lengthOfLastWord(String s) {
        String [] a = s.split(" ");
      //  int e=[a.length-1].length();
return a[a.length-1].length();
    }
}