class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(List<String>lis:items){
            if(ruleKey.equals("type")&&lis.get(0).equals(ruleValue)){
                c++; 
            } 
            else if(ruleKey.equals("color")&&lis.get(1).equals(ruleValue)) c++;
        else if(ruleKey.equals("name")&&lis.get(2).equals(ruleValue)) c++;
        }
        return c;
        }
}