class Solution {
    public int maxSubArray(int[] nums) {
        int m = Integer.MIN_VALUE;
        int n = 0;
        for(int i = 0;i<nums.length;i++){
            n += nums[i];
             if(m<n){
                 m = n;
             }
             if(n<0){
                 n = 0;
             }
        }
        return m;
    }
}