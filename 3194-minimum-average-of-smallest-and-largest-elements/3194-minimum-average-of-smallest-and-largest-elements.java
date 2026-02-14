class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        ArrayList<Double>aa=new ArrayList<>();
        while(s<e){
            aa.add((nums[s]+nums[e])/2.0);
            s++;
            e--;
        }
        Collections.sort(aa);
        return aa.get(0);
    }
}