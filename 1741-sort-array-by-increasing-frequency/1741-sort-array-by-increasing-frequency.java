class Solution {
    public int[] frequencySort(int[] nums) {
        int freq[] = new int[201];
        for(int i:nums){
            freq[i+100]++;
        }
        int count =0;
        while(count<nums.length){
        int min = Integer.MAX_VALUE;
        int ind =0;
        for(int i =0 ; i < freq.length ; i++){
            if( freq[i]!=0 ){
            if(min >= freq[i]){
                min  = freq[i];
                ind = i;
            }
            }
        }
        nums[count++] = ind-100;
        freq[ind]--;
        }
        return nums;
    }
}