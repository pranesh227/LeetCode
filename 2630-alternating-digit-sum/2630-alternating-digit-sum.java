class Solution {
    public int alternateDigitSum(int n) {
       String ss=String.valueOf(n);
       int[] arr=new int[ss.length()];
       int l=0;
       for(int i=ss.length();i>0;i--){
        if(i%2==0) {
            arr[l]=(n%10)*(-1);
            l++;
        }
        else {
            arr[l]=n%10;
            l++;
        }
        n/=10;
       }
       int sum=0;
       for(int i:arr){
        sum+=i;
       }
       return sum;
    }
}