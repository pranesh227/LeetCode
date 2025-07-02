class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int s=0;
        int e=1;
        while(s<nums.length&&e<nums.length){
            while(nums[s]!=0){
                arr.add(nums[e]);
                nums[s]--;
            }
            s+=2;
            e+=2;
        }
        int[] a1=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a1[i]=arr.get(i);
        }
        return a1;

    }
}