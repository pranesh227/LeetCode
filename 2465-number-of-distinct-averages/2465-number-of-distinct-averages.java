class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        int w=nums.length/2;
        TreeSet<Double>set=new TreeSet<>();
        while(s<e){
            double f=(nums[s]+nums[e])/2.0;
            set.add(f);
            s++;
            e--;
        }
        //System.out.print(set);
        return set.size();
    }
}