class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        if(n==2){
            res[0] = 1;
            res[1] = -1;
        }
        int sum = 0;
        for(int i = 1;i<=n-1;i++){
            res[i-1] = i;
            System.out.println(i);
            sum += i;
        }
        res[n-1] = 0-sum;
        return res;
    }
}