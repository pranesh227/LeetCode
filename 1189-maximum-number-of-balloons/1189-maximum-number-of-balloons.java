class Solution {
    public int maxNumberOfBalloons(String text) {
        String s="balloon";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(s.contains(String.valueOf(text.charAt(i)))){
                map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
            }
        }
        
        for(char c:map.keySet()){
            if(c=='l'||c=='o'){
                if(map.get(c)<2) return 0;
            }
        }
        int size=map.size()+2;
        if(size!=s.length()) return 0;
        // System.out.print(map);
        int min=Integer.MAX_VALUE;
        int mm=Integer.MAX_VALUE;
        for(char c:map.keySet()){
             if(c=='l'||c=='o'){
               mm=Math.min(mm,map.get(c));
             }
             else  min=Math.min(min,map.get(c));
        }
       // System.out.print(mm);
        
        return Math.min(min,(mm)/2);

    }
}