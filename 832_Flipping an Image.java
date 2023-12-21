class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image[0].length];
        for(int i =0;i<image.length;i++){
            for(int j =image[i].length-1,k = 0;j>=0;j--,k++){
                arr[i][k] = image[i][j];
                 if(arr[i][k]==1){
                    arr[i][k] = 0;
                }
                else{
                    arr[i][k] = 1;
                }
            }
        }
        
        return arr;
    }
}