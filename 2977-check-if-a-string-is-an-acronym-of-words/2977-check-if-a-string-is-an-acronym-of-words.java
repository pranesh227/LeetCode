class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ss="";
        String w="";
        for(int i=0;i<words.size();i++){
            w=words.get(i);
            ss+=w.charAt(0);
        }
        if(ss.equals(s)) return true;
        return false;
    }
}