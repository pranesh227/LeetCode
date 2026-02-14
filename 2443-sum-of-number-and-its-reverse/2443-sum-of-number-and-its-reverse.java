class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        //if(num==0) return true;
        for(int i=0;i<=num;i++){
            if(rev(i,num)) return true;
        }
        return false;
    }
    static boolean rev(int n,int nn){
        int i=n;
        int s=0;
         while(i!=0){
            s*=10;
            s+=i%10;
            i/=10;
        }
         if(n+s==nn) return true;
         return false;
    }
}