class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> arr=new ArrayList<>();
       HashSet<Integer>ee=new HashSet<>();
       HashSet<Integer>ww=new HashSet<>();
       for(int i:nums1){
        ee.add(i);
       }
       for(int i:nums2){
        ww.add(i);
       }
       for(int i:nums1){
        if(ww.contains(i)){
            ww.remove(i);
            ee.remove(i);
        } 
       }
       arr.add(new ArrayList<>(ee));
       arr.add(new ArrayList<>(ww));
       return arr;
    }
}