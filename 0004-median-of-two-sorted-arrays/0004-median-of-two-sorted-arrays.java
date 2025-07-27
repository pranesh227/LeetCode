class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     ArrayList<Integer>arr=new ArrayList<>();
     for(int i:nums1){
        arr.add(i);
     }   
     for(int i:nums2){
        arr.add(i);
     }
     Collections.sort(arr);
     double ss=0;
     if(arr.size()%2==1){
        ss=arr.get(arr.size()/2);
     }  
     else{
        ss=arr.get(arr.size()/2)+arr.get(arr.size()/2-1);
        ss/=2;
     }
     return ss;
    }
}