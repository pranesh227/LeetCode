class Solution {
    public int smallestIndex(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            int ans=0;
            while(t!=0){
                ans+=t%10;
                t/=10;
            }
            if(i==ans){
                c++;
                return i;
            }
        }
        if(c>0) return -1;
        return -1;
    }
}