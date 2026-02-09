class Solution {
    public String[] findWords(String[] words) {
       String s1="qwertyuiop";
       String s2="asdfghjkl";
       String s3="zxcvbnm";
       int a=0;
       int b=0;
       int c=0;
       ArrayList<String>aa=new ArrayList<>();
       for(int i=0;i<words.length;i++){
        String ss=words[i].toLowerCase();
        a=0;
        b=0;
        c=0;
        for(int j=0;j<ss.length();j++){
            if(s1.contains(String.valueOf(ss.charAt(j)))) a++;
            else if(s2.contains(String.valueOf(ss.charAt(j)))) b++;
            else if(s3.contains(String.valueOf(ss.charAt(j)))) c++;
        }
        System.out.print(a+" ");
        if(a==ss.length()||b==ss.length()||c==ss.length()) aa.add(words[i]);
       }
       String[]arr=new String[aa.size()];
       for(int i=0;i<aa.size();i++){
        arr[i]=aa.get(i);
       }
       return arr;
    }
}