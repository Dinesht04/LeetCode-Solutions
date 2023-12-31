class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> p = new ArrayList<>();
        
        for(int i = 0;i<matrix.length;i++){
            int r = Integer.MAX_VALUE;
            int q = 0;
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]<r){
                    r = matrix[i][j];
                    q = j;    
                }
            }
            boolean l = true;
            for(int k = 0;k<matrix.length;k++){
                if(matrix[k][q]>r){
                    l = false;
                    break;
                }
            }
            if(l == true){
                p.add(r);
            }
        }
        
        return p;
    }
}