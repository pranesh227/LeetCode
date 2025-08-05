class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
       int c=0;
       int cc=0;
       if(fruits.length!=baskets.length) return -1;
       for(int i=0;i<fruits.length;i++){
        cc=0;
        for(int j=0;j<baskets.length;j++){
            if(fruits[i]<=baskets[j]){
                baskets[j]=0;
                cc++;
                break;
            } 
        }
        if(cc==0) c++;
       }
       return c;
    }
}