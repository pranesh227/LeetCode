class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer>aa=new ArrayList<>();
        int[]arr=new int[n];
        int l=0;
        if(n%2==1){
        for(int i=-(n/2);i<=n/2;i++){
            arr[l]=i;
            l++;
        }
        }
        
        else{
            for(int i=-(n/2);i<=n/2;i++){
                if(i==0){
                    // l--;
                    continue;
                }
                arr[l]=i;
                l++;
            }
           
        }
        System.out.print(aa);
        return arr;
    }
}