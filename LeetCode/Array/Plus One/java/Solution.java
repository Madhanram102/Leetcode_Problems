class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1!=10){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;//[0]
        }
        int[] newarr=new int[digits.length+1];//[1,0]
        newarr[0]=1;
        return newarr;
    }
}
