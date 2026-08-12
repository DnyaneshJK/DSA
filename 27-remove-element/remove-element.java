class Solution {
    public int removeElement(int[] nums, int val) {
        int r=nums.length-1;
        int l=0;
       while(l<=r){
            if(nums[l]==val && nums[r]!=val){
                nums[l]=nums[r];
                l++;
                r--;

            } else if(nums[r]==val){
                r--;
            } else{
                l++;
            }
        }
        return l;
    }
}