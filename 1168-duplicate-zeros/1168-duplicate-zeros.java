class Solution {
    public void duplicateZeros(int[] arr) {
        int[]aa=new int[arr.length];
        int l=0;
        int u=0;
        for(int i=0;i<arr.length;i++){
            if(arr[u]==0&&l<arr.length-1){
                aa[l]=0;
                aa[l+1]=0;
                i++;
                l+=2;
                u++;
            }
            else {
                aa[l]=arr[u];
                l++;
                u++;
            }
        }
       for(int i=0;i<arr.length;i++){
        arr[i]=aa[i];
       }
       System.out.print(l);
    }
}