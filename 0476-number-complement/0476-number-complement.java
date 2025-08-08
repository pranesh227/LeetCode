class Solution {
    public int findComplement(int num) {
        StringBuilder ss=new StringBuilder();
        StringBuilder ss1=new StringBuilder();
        ss.append(Integer.toBinaryString(num));
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)=='0') ss1.append(1);
            else ss1.append(0);
        }
        int ans=Integer.parseInt(ss1.toString(),2);
        return ans;
    }
}