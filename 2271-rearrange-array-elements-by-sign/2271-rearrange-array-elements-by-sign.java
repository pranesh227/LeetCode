class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a.add(nums[i]);
            }
            else{
                a1.add(nums[i]);
            }
        }
        int l=1;
        int x=0;
        // int[]a2=new int[nums.length];
        for(int i=0;i<a.size();i++){
            nums[x]=a.get(i);
            nums[l]=a1.get(i);
            x+=2;
            l+=2;
        }
        return nums;
    }
}