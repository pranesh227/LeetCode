class Solution {
    public int countElements(int[] arr) {
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<arr.length;i++){
              boolean f1=false;
        boolean f2=false;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]) f1=true;
                if(arr[i]<arr[j]) f2=true;
            }
            if(f1==true && f2==true) c++;
        }
        return c;    
    }
}