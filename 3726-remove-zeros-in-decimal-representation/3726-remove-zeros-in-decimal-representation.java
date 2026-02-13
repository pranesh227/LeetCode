class Solution {
    public long removeZeros(long n) {
        String s="";
        while(n!=0){
            if(n%10!=0){
                s=n%10+s;
            }
            n/=10;
        }
        return Long.parseLong(s);
    }
}