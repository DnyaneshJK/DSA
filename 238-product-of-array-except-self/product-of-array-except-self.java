class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int c=0;
        int n=nums.length;
       int[] pre = new int[n];
       int[] suff = new int[n];

       for(int i=0;i<n;i++){
        pre[i] = prod;
        prod *= nums[i];
       }
        prod=1;
       for(int i=n-1;i>=0;i--){
        suff[i] = prod;
        prod *= nums[i];
       }


        for(int i=0;i<n;i++){
        nums[i] = pre[i] * suff[i];
        
       }
       return nums;
        
    }
}