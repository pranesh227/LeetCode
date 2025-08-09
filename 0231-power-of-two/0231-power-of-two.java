class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        String st=Integer.toBinaryString(n);
        if(n==-2147483648) return false;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='1'){
                c++;

            }
        }
        if(c==1){
            return true;
        }
        return false;
        
    }
}