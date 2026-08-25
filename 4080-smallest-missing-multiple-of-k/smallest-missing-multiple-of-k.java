class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        int ans =0;
        int t=k;

        for(int n : nums){
            set.add(n);
        }

        for(int i=0;i<nums.length;i++){
            if(set.contains(k)){
                k+=t;
            } 
             ans=k;   
            
        }
        return ans;
    }
}