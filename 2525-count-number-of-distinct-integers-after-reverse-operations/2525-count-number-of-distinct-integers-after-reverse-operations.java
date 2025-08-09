class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            s.append(String.valueOf(nums[i]));
            s=s.reverse();
            set.add(Integer.valueOf(s.toString()));
            s.setLength(0);
        }
        return set.size();   
    }
}