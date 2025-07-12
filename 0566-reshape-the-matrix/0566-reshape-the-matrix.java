class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat[0].length*mat.length)!=(r*c)) return mat;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr.add(mat[i][j]);
            }
        }
        int l=0;
        int[][]aa=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aa[i][j]=arr.get(l);
                l++;
            }
        }
        return aa;
    }
}