class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder ss=new StringBuilder();
        for(String s1:words){
            ss.append(s1);
            if(s.equals(ss.toString())) return true;
        }
        return false;
    }
}