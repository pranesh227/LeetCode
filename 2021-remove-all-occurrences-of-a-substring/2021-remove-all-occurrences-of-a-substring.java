class Solution {
    public String removeOccurrences(String s, String part) {
        // s=s.replace(part,"");
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}