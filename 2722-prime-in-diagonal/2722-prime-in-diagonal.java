class Solution {
    public int diagonalPrime(int[][] nums) {
        Set<Integer>arr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j){
                    arr.add(nums[i][j]);
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i][nums.length-i-1]);
        }
        List<Integer>list=new ArrayList<>(arr);
        int m=0;
        for(int i=0;i<list.size();i++){
            if(isP(list.get(i))){
                if(list.get(i)>m){
                    m=list.get(i);
                }
            }
        }
        return m;
       
    }
    static boolean isP(int n){
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}