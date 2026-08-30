class Solution {
    public int minimumDeletions(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n= nums.length;
        int imax=0;
        int imin=0;
  

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                imax=i;
            }
            if(nums[i]<min){
                min = nums[i];
                imin=i;
            }
        }

       int l = Math.max(imin,imax)+1;
       int r = n-Math.min(imin,imax);

       int b = Math.min(imin+1+n-imax,n-imin+imax+1);

       return Math.min(Math.min(l,r),b); 
    }
}