class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length+1];
        arr[0]=0;
        int sum=0;
        int l=0;
        for(int i=0;i<gain.length;i++){
            sum=0;
            sum=arr[l]+gain[i];
            l++;
            arr[l]=sum;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        int s=Arrays.stream(arr).max().getAsInt();
        return s;
    }
}