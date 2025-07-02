class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        int i=0;
        int max=0;
        while(i<s.length()){
            if(!arr.contains(s.charAt(i))){
                arr.add(s.charAt(i));
                max=Math.max(max,arr.size());
                i++;
            }
            else{
                arr.remove(0);
            }
        }
        return max;
        
    }
}