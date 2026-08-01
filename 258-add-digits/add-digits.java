class Solution {
    public int addDigits(int num) {
        int sum =0;
        int sum1 =0;
        int sum2 =0;
        
        
        while (num!=0){
            int dig = num%10;
            sum = sum +dig;
            num = num/10;
        }
        while(sum!=0){
            int dig = sum%10;
            sum1+=dig;
            sum= sum /10;
        }
        while(sum1!=0){
            int dig = sum1%10;
             sum2 = sum2+dig;
            sum1/=10;
        }
        return sum2;
        
        
    }
}
