class Solution {
    public int minimumMoves(String s) {
        int c=0;
            for(int i=0;i<s.length();){
                if(s.charAt(i)=='X') {
                    i+=3;
                    c++;
                }
                else{
                    i++;
                }
            }
            return c;
    }
}