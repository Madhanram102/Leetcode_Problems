class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int count=0, res=0;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>0){
            res = nums[i];
            break;
            }
        }
        return res;
    }
}
