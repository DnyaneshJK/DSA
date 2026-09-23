class Solution {
    public int minOperations(int[] nums, int x) {

    int n=nums.length;
    int sum=0;
    for(int n1:nums){
        sum+=n1;
    }

    int t = sum-x;

    if(sum==x){
        return n;
    }

    int l=0;
    int s=0;
    int max=-1;
    for(int r=0;r<n;r++){

        s+=nums[r];

        while(s>t && l<=r){
            s-=nums[l];
            l++;
        }

        if(s==t){
            max=Math.max(max,r-l+1);
        }
    }
    if(max==-1) return -1;
        return n-max;
    }
}