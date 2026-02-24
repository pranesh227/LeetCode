class Solution {
    public int gcdOfOddEvenSums(int n) {
        int s=0;
        int so=0;
        int se=0;
        while(s/2!=n){
            s+=1;
            so+=s;
            s+=1;
            se+=s;
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(so%i==0&&se%i==0) max=Math.max(max,i);
        }
        return max;
    }
}