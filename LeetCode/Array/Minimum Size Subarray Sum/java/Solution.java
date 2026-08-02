class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int n=nums.length;
        int sum=0;
        int len=0;
        int min=Integer.MAX_VALUE;

        while(r<n){
            sum+=nums[r];//2
            while(sum>=target){
                len = r-l+1;
                min=Math.min(len,min);
                sum-=nums[l];
                l++;
                }
            r++;
            }
        if(min==Integer.MAX_VALUE) return 0;

        
        return min;
    }
}