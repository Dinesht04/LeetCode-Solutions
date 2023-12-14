class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = Integer.MIN_VALUE;
        for(int i = 0;i<accounts.length;i++){
            int c = 0;
            for(int j = 0;j<accounts[i].length;j++){
                c+=accounts[i][j];
            }
            m = Math.max(c,m);
        }
        return m;
    }
}