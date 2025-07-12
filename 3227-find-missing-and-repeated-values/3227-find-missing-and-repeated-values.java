class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] fre=new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                fre[grid[i][j]]++;
            }
        }
        int max=0;
        int l=0;
        int m=0;
        int[]arr=new int[2];
        for(int i=0;i<fre.length;i++){
            if(fre[i]==0) m=i;
            if(max<fre[i]){
                max=fre[i];
                l=i;
            }
        }
        arr[0]=l;
        arr[1]=m;
        return arr;
    }
}