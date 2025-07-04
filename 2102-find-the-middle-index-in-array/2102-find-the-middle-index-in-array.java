class Solution {
    public int findMiddleIndex(int[] nums) {
        int[]arr=new int[nums.length];
        int[]arr1=new int[nums.length];
        int l=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            arr[l]=sum;
            sum+=nums[i];
            l++;
        }
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];    
            }
            arr1[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==arr1[i]) return i;
        }
       
        return -1;
        
    }
}