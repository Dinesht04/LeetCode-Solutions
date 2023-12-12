class Solution {
    public int[] buildArray(int[] nums) {
        int[] m = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            m[i] = nums[nums[i]];
        }
        return m;
    }
}