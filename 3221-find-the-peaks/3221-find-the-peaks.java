class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer>aa=new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i-1]&&mountain[i]>mountain[i+1]){
                aa.add(i);
            }
        } 
        return aa;

    }
}