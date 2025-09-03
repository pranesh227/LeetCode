class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         HashMap<String,Integer>map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> arr=new ArrayList<>(map.keySet());
        Collections.sort(arr,(a,b)->{
            int aa=map.get(a);
            int bb=map.get(b);
            if(aa!=bb){
                return bb-aa;
            }
            return a.compareTo(b);
        });
        ArrayList<String>aa=new ArrayList<>();
        for(int i=0;i<k;i++){
            aa.add(arr.get(i));
        }
        return aa;
    }
}