class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int m = mat.length-1, n = mat.length;
        int[][] res = new int[n][n];

        //First Check
        boolean check = checkIt(mat,target);
        System.out.println(check);
        if(check == true){
            return true;
        }
        

       //Second Check
       rotateIt(res,mat);
       check = checkIt(res,target);
       System.out.println(check);
        if(check == true){
            return true;
        }
        

        //Third Check
        rotateIt(mat,res);
        check = checkIt(mat,target);
        System.out.println(check);
        if(check == true){
            return true;
        }
        

        //Fourth Check
        rotateIt(res,mat);
        check = checkIt(res,target);
        System.out.println(check);
        
        return check;

    }

    public boolean checkIt(int[][] res,int[][] target){
        int n = res.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(res[i][j]!=target[i][j]){
                    return false;
                }        
            }
        }
        return true;
    }
    public static void rotateIt(int[][] res,int[][] mat){
            int n = res.length,m = res.length-1;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    res[i][j] = mat[m-j][i];
                }
            }
    }
}