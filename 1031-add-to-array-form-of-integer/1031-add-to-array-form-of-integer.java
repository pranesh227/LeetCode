import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       String s="";
       String s1=String.valueOf(k);
       for(int i=0;i<num.length;i++){
        s+=String.valueOf(num[i]);
       } 
       BigInteger b=new BigInteger(s);
       BigInteger b1=new BigInteger(s1);
       b=b.add(b1);
       String ans=String.valueOf(b);
       List<Integer>aa=new ArrayList<>();
       for(char c:ans.toCharArray()){
        aa.add(c-'0');
       }
       return aa;
    }
}