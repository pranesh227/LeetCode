class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i:nums){
            arr.add(i);
        }
        while(k!=0){
            int min=Collections.min(arr);
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==min){
                    arr.set(i,min*multiplier);
                    break;
                }
            }
            k--;
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return nums;
    }
}