class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int sum2=1;
        int t=n;
        while(n!=0){
            sum+=n%10;
            sum2*=n%10;
            n/=10;
        }
        if(t%(sum+sum2)==0) return true;
        return false;
    }
}