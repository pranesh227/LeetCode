class Solution {
    public String greatestLetter(String s) {
        ArrayList<Character>aa=new ArrayList<>();
        String ss=s;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                char c=(char)(s.charAt(i)+32);
                if(ss.contains(String.valueOf(c))){
                    aa.add(s.charAt(i));
                }   
            }
        }
        Collections.sort(aa);
        ss="";
        if(aa.size()>0) ss+=aa.get(aa.size()-1);
        return ss;
    }
}