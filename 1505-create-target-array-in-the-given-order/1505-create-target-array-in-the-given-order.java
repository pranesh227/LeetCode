class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            arr.add(index[i],nums[i]);
        }
        int l=0;
        for(int i:arr){
            nums[l]=i;
            l++;
        }
        return nums;
    }
}