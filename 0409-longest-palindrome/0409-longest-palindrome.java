class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=0;
        int sum=0;
        boolean flag=false;
        for(char c:map.keySet()){
            if(map.get(c)%2==0) sum+=map.get(c);
            else {
                flag=true;
                sum=sum+(map.get(c)-1);
            }
        }
        if(flag==true) return sum+1;
        return sum;

    }
}