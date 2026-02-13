class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n!=0){
            map.put(n%10,map.getOrDefault(n%10,0)+1);
            n/=10;
        }
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i:map.keySet()){
            if(map.get(i)<min){
                min=map.get(i);
                ans=i;
            }
        }
        return ans;
    }
}