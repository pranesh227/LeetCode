class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder st=new StringBuilder();
        String[] arr=date.split("-");
        for(int i=0;i<arr.length;i++){
            int aa=Integer.valueOf(arr[i]);
            st.append(Integer.toBinaryString(aa));
            if(i!=arr.length-1)  st.append("-");
        }
        return st.toString();
    }
}