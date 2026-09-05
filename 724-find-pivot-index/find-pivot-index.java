class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            l[i] = sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            r[i] = sum;
            sum+=nums[i];
        }

        for(int i=0;i<n;i++){
            if(l[i] == r[i]) return i;
        }


        return -1;
    }
}