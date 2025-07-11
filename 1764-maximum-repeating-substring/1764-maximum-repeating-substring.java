class Solution {
    public int maxRepeating(String sequence, String word) {
    //     StringBuilder ss=new StringBuilder();
    //     int c=0;
    //     for(int i=0;i<word.length();i++){
    //         ss.append(sequence.charAt(i));
    //     }
    //     if(ss.toString().equals(word)) c++;
    //    for(int i=word.length();i<sequence.length();i++){
    //     ss.deleteCharAt(0);
    //     ss.append(sequence.charAt(i));
    //     if(ss.toString().equals(word)) c++;

    //    }
    //    return c;
    int max = 0;
StringBuilder sb = new StringBuilder(word);
while (sequence.contains(sb.toString())) {
    max++;
    sb.append(word);
}
return max;

    }
}