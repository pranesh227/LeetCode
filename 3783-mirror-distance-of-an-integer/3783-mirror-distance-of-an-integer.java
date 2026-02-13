class Solution {
    public int mirrorDistance(int n) {
        String s="";
        int nn=n;
        while(nn!=0){
            s+=nn%10;
            nn/=10;
        }
        return Math.abs(n-Integer.parseInt(s));
    }
}