class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {


        int target = 0;

        switch(ruleKey){
            case "type":
                target = 0;
                break;
            case "color":
                target = 1;
                break;
            case "name":
                target = 2;
                break;
        }

        int count = 0;

        for(int i = 0;i<items.size();i++){
                if(items.get(i).get(target).contentEquals(ruleValue)){
                    count +=1;
                }
            }
            return count;

        

            
    }
}