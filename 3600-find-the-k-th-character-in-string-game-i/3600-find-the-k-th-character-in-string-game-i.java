class Solution {
    public char kthCharacter(int k) {
        String st="a";
        int size=st.length();
        while(size<k){
            for(int i=0;i<size;i++){
                if(st.charAt(i)=='z') st+='a';
                st+=(char)(st.charAt(i)+1);
            }
            size=st.length();
        }
      
       return st.charAt(k-1);
    }
}