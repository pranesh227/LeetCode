class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> arr=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[]ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String st=String.valueOf(ch);
            if(map.containsKey(st)){
                List<String> ans=map.get(st);
                ans.add(strs[i]);
            }
            else{
                List<String> cur=new ArrayList<>();
                cur.add(strs[i]);
                map.put(st,cur);
            }
        }
         for(String i:map.keySet()){
                arr.add(map.get(i));
            }
            return arr;
    }
}