class Solution {
    public int mostWordsFound(String[] sentence) {
        int max=0;
        for(int i=0;i<sentence.length;i++){
            int s=sentence[i].split("\\s+").length;
            max=Math.max(max,s);
        }
        return max;
    }
}