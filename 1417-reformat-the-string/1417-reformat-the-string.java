class Solution {
    public String reformat(String s) {
        String ss="";
        String nn="";
        String a="";
        String aa="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) nn+=s.charAt(i);
            else ss+=s.charAt(i);
        }
        if((nn.length()==0&&ss.length()==1)) return ss;
        if((nn.length()==1&&ss.length()==0)) return nn;
        if(nn.length()==0||ss.length()==0) return a;
        int max=Math.max(nn.length(),ss.length());
        int min=Math.min(nn.length(),ss.length());
      if(max==min||max-min==1){
            int k=0;
            int u=0;
             if(ss.length()==max){
            for(int i=0;i<max;i++){
               
                a+=ss.charAt(i);
                if(nn.length()>k) a+=nn.charAt(k);
                k++;
                }
             }
                else{
                   for(int j=0;j<nn.length();j++){
                a+=nn.charAt(j);
                if(ss.length()>u) a+=ss.charAt(u);
                u++;
                }
                }
            }
      
       // System.out.print(nn+" "+ss);
        if(aa.length()>0) return aa;
         return a;
    }
}