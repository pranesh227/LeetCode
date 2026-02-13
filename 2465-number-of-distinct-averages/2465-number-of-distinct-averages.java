class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        int w=nums.length/2;
        TreeSet<Float>set=new TreeSet<>();
        while(s!=w&&e!=w-1){
            float f=(nums[s]+nums[e])/2;
            if((nums[s]+nums[e])%2!=0) f+=0.5;
            set.add(f);
            s++;
            e--;
        }
        //System.out.print(set);
        return set.size();
    }
}