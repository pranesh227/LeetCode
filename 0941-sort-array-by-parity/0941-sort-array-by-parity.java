class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            if(nums[s]%2>nums[e]%2){
                int temp=nums[e];
                nums[e]=nums[s];
                nums[s]=temp;
                s++;
                e--;
            }
            if(nums[s]%2==0) s++;
            if(nums[e]%2==1) e--;
        }
        return nums;
    }
}