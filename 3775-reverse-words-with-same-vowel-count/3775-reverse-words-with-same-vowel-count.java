class Solution {
    public String reverseWords(String s) {
        String[] ss=s.split("\\s+");
        String sf="";
        if(ss.length<=0) return sf;
        String st=ss[0];
        String v="aeiou";
        int c=0;
        sf+=ss[0]+" ";
        for(int i=0;i<st.length();i++){
            if(v.contains(String.valueOf(st.charAt(i)))) c++;
        }
        int y=0;
        for(int i=1;i<ss.length;i++){
            StringBuilder sb=new StringBuilder();
            if(crt(ss[i],v,c)&&ss[i].length()>=c){
                sb.append(ss[i]);
                sb.reverse();
                sf+=sb.toString()+" ";
                y++;
            }
            else sf+=ss[i]+" ";
        }
        System.out.print(y);
        return sf.trim();
    }
    static boolean crt(String stt, String v, int c){
        int c1=0;
        for(int i=0;i<stt.length();i++){
            if(v.contains(String.valueOf(stt.charAt(i)))) c1++;
        }
        if(c==c1) return true;
        return false;
    }
}