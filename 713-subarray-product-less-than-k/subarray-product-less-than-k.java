class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int pro = 1;
        int ans=0;

        for(int right=0;right<nums.length;right++){
            pro*=nums[right];
            if(k<=1) return 0;
            
            while(pro>=k){
                pro/=nums[left];
                left++;
            }
            ans+=right-left+1;
        }
        return ans;
    }
}