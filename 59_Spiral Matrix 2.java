class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int l = 0,r = n-1;
        int t = 0,b = n-1;
        int x = 1;
        while(l<=r && t<=b){
            for(int i = l;i<=r;i++){
                mat[t][i] = x;
                x++; 
            }
            t++;
            for(int i = t;i<=b;i++){
                mat[i][r]=x;
                x++;
            }
            r--;
            if(l<=r && t<=b){
            for(int i = r;i>=l;i--){
                mat[b][i] = x;
                x++;  
            }
            b--;
            for(int i = b;i>=t;i--){
                mat[i][l] = x;
                x++;
            }
            l++;
            }
        }
        return mat;
    }
}