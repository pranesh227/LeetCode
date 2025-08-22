class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>aa=new ArrayList<>();
        ArrayList<Integer>aa1=new ArrayList<>();
        if(nums.length==2) return nums;
        aa.add(nums[0]);
        aa1.add(nums[1]);
        for(int i=2;i<nums.length;i++){
           int max= Math.max(aa.get(aa.size()-1),aa1.get(aa1.size()-1));
            if(aa.contains(max)) aa.add(nums[i]);
            else aa1.add(nums[i]);
        }
       for(int i=0;i<aa.size();i++){
        nums[i]=aa.get(i);
       }
       int l=aa.size();
       for(int i=0;i<aa1.size();i++){
        nums[l]=aa1.get(i);
        l++;
       }
       return nums;
    }
}