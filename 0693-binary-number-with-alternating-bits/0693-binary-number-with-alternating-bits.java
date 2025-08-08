class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder ss=new StringBuilder();
        ss.append(Integer.toBinaryString(n));
        int c=0;
        for(int i=0;i<ss.length()-1;i++){
            if(ss.charAt(i)==ss.charAt(i+1)) c++;
        }
        if(c>0) return false;
        return true;
    }
}