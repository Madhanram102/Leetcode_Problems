class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=0;
        int n=nums.length;
        double sum=0;
        double max=Double.NEGATIVE_INFINITY;

        while(r<n){
            sum+=nums[r];
            if(r-l+1==k){//0-0+1=1--->12
                double avg=sum/k;
                sum-=nums[l];
                max=Math.max(avg,max);
                l++;
            }
            r++;
        }
        return max;
        }}