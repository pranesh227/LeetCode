class Solution {
    public int countSubstrings(String s) {
        int c=0;
       for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            String ss=s.substring(i,j);
            if(ispal(ss)) c++;
        }
       }
       return c;
    }
    static boolean ispal(String aa){
        int i=0;
        int j=aa.length()-1;
        while(i<j){
            if(aa.charAt(i)!=aa.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}