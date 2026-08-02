class Solution {
    public boolean isPalindrome(String s) {
        String newstring = "" ;
        for(int i =0 ;i<=s.length()-1;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if((ch>='a' && ch<='z')||(ch>='0'&&ch<='9')){
                newstring+= ch;
            }
        }
        int low =0,high=newstring.length()-1;
        while(low<high){
            if(newstring.charAt(low)!=newstring.charAt(high)){
                return false;
            }
            low++ ; high--;
        }
        
        return true;
    }
}
