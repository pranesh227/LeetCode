class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        ArrayList<Integer>aa=new ArrayList<>();
        for(int i:nums){
            if(!aa.contains(i)) aa.add(i);
        }
        Collections.sort(aa);
        k = Math.min(k, aa.size());
        int arr[]=new int[k];
        int l=0;
        for(int i=aa.size()-1;i>=aa.size()-k;i--){
            arr[l]=aa.get(i);
            l++;
        }
        return arr;

    }
}