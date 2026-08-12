class Solution {
    public int removeDuplicates(int[] nums) {

        int r=1;
        int l=0;
        int n=nums.length;

        while(r<n){
            if(nums[l]!=nums[r]){
                nums[l+1]=nums[r];
                l++;
                r++;
            } else{
                r++;
            }
        }

            return l+1;

        // LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // for(int num: nums){
        //     set.add(num);
        // }
        // int n=set.size();
        // int i=0;
        // for(int num:set){
        //     nums[i++] = num;
        // }
        // return n;
    }
}