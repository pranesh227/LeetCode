class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] aa=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            aa[i]=arr[i];
        }
        Arrays.sort(aa);
        int l=1;
        for(int i:aa){
            if(!map.containsKey(i)){
            map.put(i,l);
            l++;
            }
        }
        l=0;
        for(int i:arr){
            aa[l]=map.get(i);
            l++;

        }
        return aa;
    }
}