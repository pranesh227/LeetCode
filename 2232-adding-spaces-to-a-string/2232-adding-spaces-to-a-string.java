class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ss=new StringBuilder();
        int l=0;
        for(int i=0;i<s.length();i++){
            if(l<spaces.length&&i==spaces[l]) {
                ss.append(" ");
                ss.append(s.charAt(i));
                l++;
            }
            else ss.append(s.charAt(i)); 
        }
        return ss.toString();
    }
}