class Solution {
    public String frequencySort(String s) {
        List<Character>list=new ArrayList<>();
        for(char c:s.toCharArray()){
            list.add(c);
        }
   Map<Character,Integer>hm=new HashMap<>();
   for(char c:s.toCharArray()){
    hm.put(c,hm.getOrDefault(c,0)+1);
   }
   Collections.sort(list,(a,b)->{
    int n1=hm.get(a);
    int n2=hm.get(b);
    if(n1!=n2){
        return Integer.compare(n2,n1);
    }
    else{
        return Integer.compare(a,b);

    }
   });
   StringBuilder sb=new StringBuilder();
   for(char i:list){
    sb.append(i);
   }
   return sb.toString();
    }
}