class Solution {
    public int secondHighest(String s) {
        String[] stt=s.split("\\D+");
        String ss="";
        for(String st:stt){
            if(!st.isEmpty()) ss+=st;
        }
        // System.out.print(ss);
        ArrayList<Integer>aa=new ArrayList<>();
       for(int i=0;i<ss.length();i++){
        if(!aa.contains((ss.charAt(i)-'0'))) aa.add((ss.charAt(i)-'0'));
       }
       Collections.sort(aa);
       //System.out.print(aa);
       if(aa.size()>=2) return aa.get(aa.size()-2);
       else return -1;
    }
}