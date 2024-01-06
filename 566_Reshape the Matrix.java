class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                list.add(mat[i][j]);
            }
        }
        int[][] res = new int[r][c];
        int count = 0;
        for(int i = 0;i<res.length;i++){
            for(int j = 0;j<res[i].length;j++){
                res[i][j] = list.get(count);
                count++;
            }
        }
        return res;
    }
}