class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            arr.add(i);
        }
       } 
    //    for(int i:arr){
    //     System.out.print(i+" ");
    //    }
       int c=0;
       for(int i=0;i<arr.size()-1;i++){
        int ans=Math.abs(arr.get(i)-arr.get(i+1))-1;
         if(ans<k) c++;
       }
      
       if(c==0) return true;
       return false;
    }
}