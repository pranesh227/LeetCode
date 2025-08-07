class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        ArrayList<Integer>aa=new ArrayList<>();
        for(int i:banned){
            aa.add(i);
        }
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!aa.contains(i)) a.add(i);
        }
        int sum=0;
        int w=0;
        int y=0;
        for(int i:a){
            System.out.print(i+" ");
        }
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
            if(sum<=maxSum){
                y+=sum;
                w=i;
            }
        }
        if(w>0)return w+1;
        return w;
    }
}