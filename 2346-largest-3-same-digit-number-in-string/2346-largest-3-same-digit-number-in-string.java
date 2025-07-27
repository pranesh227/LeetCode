class Solution {
    public String largestGoodInteger(String nums) {
        int a=0;
        int j=1;
        int k=2;
        int max=-1;
      for(int i=0;i<nums.length();i++){
        if(k<=nums.length()-1){
        if(nums.charAt(a)==nums.charAt(j)&&nums.charAt(a)==nums.charAt(k)){
            max=Math.max(max,(int)nums.charAt(i)-48);
        }
        a=j;
        j=k;
        k++;
        }
      }
      String st="";
      if(max==-1) return st;
      else{
        for(int i=0;i<3;i++){
            st+=String.valueOf(max);
        }
      }
      return st;
       
    }
}