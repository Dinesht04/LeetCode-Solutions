class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0,j = 0, k = mat[i].length-1;i<mat.length;i++,j++,k--){
            if(j==k){
                sum += mat[i][j];
            }
            else{
                sum += mat[i][j] + mat[i][k];
            }
        }
        return sum;
    }
}
