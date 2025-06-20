import java.util.Scanner;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tringle =new ArrayList<>();
  Scanner sc =new Scanner (System.in);

        for (int i =0;i<numRows;i++){
             List<Integer> row = new ArrayList<>();
            int b = 1;
            for(int j=0;j<=i;j++){
                row.add(b);
              
                b=b*(i-j)/(j+1);
            }
            
        
   tringle.add(row);
        }
        return tringle;
   }
}