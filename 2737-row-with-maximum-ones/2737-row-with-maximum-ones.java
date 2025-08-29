class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=-1;
        int c=0;
        int n=0;
        for(int i=0;i<mat.length;i++){
            c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) c++;
            }
            if(max<c){
                max=c;
                n=i;
            }
        }
        return new int[]{n,max};
    }
}