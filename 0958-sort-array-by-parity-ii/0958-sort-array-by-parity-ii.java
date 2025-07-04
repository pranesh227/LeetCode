class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[]arr=new int[nums.length];
        int l=0;
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr1.add(nums[i]);
            }
            if(nums[i]%2==1){
                arr2.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length/2;i++){
            arr[l]=arr1.get(i);
            l++;
            arr[l]=arr2.get(i);
            l++;
        }
        return arr;
    }
}