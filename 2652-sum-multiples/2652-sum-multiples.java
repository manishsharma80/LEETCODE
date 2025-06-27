class Solution {
    public int sumOfMultiples(int n) {
        int b=0;
        for (int i=0;i<=n;i++){
            if (i%3==0){
                b=b+i;
            }
            else if (i%5==0){
                b=b+i;
            }
            else if (i%7 ==0){
                b=b+i;
            }
        }
        return b;
    }
}