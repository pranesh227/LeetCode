class Solution {
    public long splitArray(int[] nums) {
        long p=0;
        long n=0;
        for(int i=0;i<nums.length;i++){
            if(prim(i)) p+=nums[i];
            else n+=nums[i];
        }
        return Math.abs(n-(p));
    }
    static boolean prim(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                //System.out.print(i+" ");
                return false;
            }
        }
        return true;
    }
}