class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String ss="aeiou";
        int c=0;
        for(int i=left;i<=right;i++){
            String s=words[i];
            if(ss.contains(String.valueOf(s.charAt(0)))&&ss.contains(String.valueOf(s.charAt(s.length()-1)))) c++;
        }
        return c;
    }
}