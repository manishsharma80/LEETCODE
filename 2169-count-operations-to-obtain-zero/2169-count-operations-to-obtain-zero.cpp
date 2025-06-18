class Solution {
public:
    int countOperations(int num1, int num2) {
        int a = max(num1,num2);
        int b = 0;
        if(num1==0 || num2==0) return b;
        for(int i = 0; i<a; i++){
            if(num1>=num2){
                num1 -=num2;
            }
            else num2-=num1;
            b++;
            if(num1==0 || num2==0){
                return b;
            }
        }
        return b;
    }
};