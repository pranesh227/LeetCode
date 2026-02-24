class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int s=0;
        int ss=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            ss+=nums[i];
        }
        return Math.abs(s-ss);
    }
}