class Solution {
    public int largestAltitude(int[] gain) {
        int h = 0;

        if(gain.length==0){
            return 0;
        }
        
        if(gain[0]>=h){
                h = gain[0];        
        }

        for(int i = 1;i<gain.length;i++){
            gain[i] += gain[i-1];
            if(gain[i]>=h){
                h = gain[i];
            }
        }
        return h;
    }
}