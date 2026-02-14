class Solution {
    public int beautifulSubstrings(String s, int k) {
        String v="aeiouAEIOU";
        String c="BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        int count=0;
        
        for(int i=0;i<s.length();i++){
            int vv=0;
            int cc=0;
            for(int j=i;j<s.length();j++){
             if(c.contains(String.valueOf(s.charAt(j)))) cc++;
            else vv++;
            if(cc==vv) {
                if(((cc)*(vv))%k==0) count++;
            }
            }
            
        }
         return count;
        }
    }
    