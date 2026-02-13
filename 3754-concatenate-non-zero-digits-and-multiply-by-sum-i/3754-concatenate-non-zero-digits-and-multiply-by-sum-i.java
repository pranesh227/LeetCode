class Solution {
    public long sumAndMultiply(int n) {
       long sum=0;
        String s="";
        while(n!=0){
            if(n%10!=0){
                sum+=(long)(n%10);
                s=n%10+s;
            }
            n/=10;
        }
        if(s.equals("")) return 0;
        long l=0;
        l=Long.valueOf(s)*sum;
        return l;
    }
}