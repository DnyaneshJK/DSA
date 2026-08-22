class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;

            if(nums[i]>nums[j]){
                inc = false;
            }

            if(nums[i]<nums[j]){
                dec =  false;
            }

        }

        return inc || dec;
    }
}