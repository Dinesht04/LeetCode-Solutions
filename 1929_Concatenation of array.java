class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int[2*nums.length];
        for(int i = 0;i<nums.length;i++){
            a[i] = nums[i];
            a[i+nums.length] = nums[i];
        }
        nums = a;
        System.gc();
        return nums;
    }

}