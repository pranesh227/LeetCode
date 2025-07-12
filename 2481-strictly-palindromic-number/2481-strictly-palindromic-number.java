class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int t=2;
        int temp=n;
        String st="";
       if(t<n-1){
        while(temp!=0){
        st+=String.valueOf(temp%t);
        temp/=10;
        }
        temp=n;
        t++;
       } 
       StringBuilder ss=new StringBuilder(st);
       ss.reverse().toString();
       if(st.equals(ss)) return true;
       return false;
    }
}