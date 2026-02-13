class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        String[] aa=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                int max=Integer.MIN_VALUE;
                int n=0;
                while(nums[i]!=0){
                    max=Math.max(max,nums[i]%10);
                    nums[i]/=10;
                    n++;
                }
                String ss=String.valueOf(max).repeat(n);
                //System.out.print(max);
                aa[i]=ss;
            }
            else aa[i]=String.valueOf(nums[i]);
        }
        //System.out.print(aa);
        int sum=0;
        for(String st:aa){
            sum+=Integer.valueOf(st);
        }
        return sum;
    }
}