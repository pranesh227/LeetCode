class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:bulbs){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>aa=new ArrayList<>();
        for(int i:map.keySet()){
            if((map.get(i)%2)==1){
                aa.add(i);
            }
        }
        Collections.sort(aa);
        return aa;
    }
}