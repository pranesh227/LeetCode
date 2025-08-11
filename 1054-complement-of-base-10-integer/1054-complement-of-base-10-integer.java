class Solution {
    public int bitwiseComplement(int n) {
        String m=Integer.toBinaryString(n);
        String g="";
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='1') g+='0';
            else g+='1';
        }
        int ans=0;
        int l=0;
        for(int i=g.length()-1;i>=0;i--){
            if(g.charAt(i)=='1') ans+=(int)Math.pow(2,l);
            l++;
        }
        System.out.print(g);
        return ans;
    }
}