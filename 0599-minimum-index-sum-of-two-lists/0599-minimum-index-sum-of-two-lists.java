class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<Integer>arr2=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int sum=0;
        int c=0;
        for(int i=0;i<list1.length;i++){
            sum=0;
            c=0;
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    c++;
                    sum=i+j;  
                } 
            }
                if(c>0) {
                  arr2.add(sum);
                  map.put(list1[i],sum);
                }     
        }
        int ee=Collections.min(arr2);
        ArrayList<String>st=new ArrayList<>();
        for(String s:map.keySet()){
            if(map.get(s)==ee) st.add(s);
        }
        String[] ans=new String[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i]=st.get(i);
        }
        return ans;
    }
}