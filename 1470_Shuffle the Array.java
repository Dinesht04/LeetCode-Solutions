class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
        if(nums.length==0){
            return nums;
        }
        
        

        int[] arr = new int[2*n];
        
        for(int i = 0;i<n;i++){
            arr[i*2] = nums[i];
            arr[(i*2)+1] = nums[i+n];
        }

        return arr;
    }
}