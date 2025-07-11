class Solution {
    public int minOperations(int n) {
        int l=0;
        int sum=0;
       for(int i=1;l<n;i+=2){
        sum+=i;
        l++;
       }
       return sum/4; 
    }
}