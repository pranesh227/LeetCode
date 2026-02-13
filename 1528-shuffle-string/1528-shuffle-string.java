class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(indices[i],s.charAt(i));
        }
        Arrays.sort(indices);
        String ss="";
        for(int i:indices){
            ss+=map.get(i);
        }
       // System.out.print(map);
        return ss;
    }
}