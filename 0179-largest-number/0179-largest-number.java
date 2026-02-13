class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String>aa=new ArrayList<>();
        for(int a:nums){
            aa.add(String.valueOf(a));
        }
       Collections.sort(aa,(a,b)->(b+a).compareTo(a+b));
        String s="";
        if(aa.get(0).equals("0")) return "0";
        for(String i:aa){
            s+=i;
        } 
        return s;
    }
}