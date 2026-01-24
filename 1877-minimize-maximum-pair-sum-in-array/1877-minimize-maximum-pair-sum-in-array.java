class Solution {
    public int minPairSum(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        while(left<=right){
            int cur=nums[left]+nums[right];
            max=Math.max(max,cur);
            left++;
            right--;
        }
        return max;
    }
}