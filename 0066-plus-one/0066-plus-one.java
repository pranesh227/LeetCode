class Solution {
    public int[] plusOne(int[] arr) {
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            else{
                arr[i]=0;
            }
        }
        int[] arr1=new int[n+1];
        arr1[0]=1;
        return arr1;
    
        
    }
}