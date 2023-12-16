class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> arr = new ArrayList<>();

        if(candies.length==0){
            return arr;
        }

        int maxValue = Integer.MIN_VALUE;
        
        for(int i =0;i<candies.length;i++){
            if(candies[i]>=maxValue){
                maxValue=candies[i];
            }
        }
        

        for(int i = 0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=maxValue){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
            // ((candies[i]+extraCandies)>=maxValue) ? arr.add(i,true): arr.add(i,false);
        }
        return arr;
    }
}