class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
       ArrayList<Integer>arr=new ArrayList<>();
       for(int i:colors){
        arr.add(i);
       } 
       arr.add(colors[0]);
       arr.add(colors[1]);
       int c=0;
       for(int i=1;i<arr.size()-1;i++){
        if(arr.get(i)!=arr.get(i-1)&&arr.get(i)!=arr.get(i+1)) c++;
       }
       return c;
    }
}