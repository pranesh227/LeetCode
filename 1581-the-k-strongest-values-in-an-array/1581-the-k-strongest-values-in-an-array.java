class Solution {
    public int[] getStrongest(int[] arr, int k) {
        ArrayList<Integer>arr1=new ArrayList<>();
        for(int i:arr){
            arr1.add(i);
        }
        Arrays.sort(arr);
        int m=arr[(arr.length-1)/2];
        Collections.sort(arr1,(a,b)->{
            int aa=Math.abs(a-m);
            int bb=Math.abs(b-m);
            if(aa!=bb){
                return bb-aa;
            }
            else{
                return b-a;
            }

        });
        int[]ans=new int[k];
       for(int i=0;i<k;i++){
        ans[i]=arr1.get(i);
       }
       return ans;
    }
}