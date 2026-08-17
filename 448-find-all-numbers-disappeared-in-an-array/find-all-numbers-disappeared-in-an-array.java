class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        int n= nums.length;

        for(int i=0;i<n;i++){
            int n1= Math.abs(nums[i]);
            int index = n1-1;
            if(nums[index]>0){
             nums[index] = -nums[index];
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }

        return ans;
        // HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> lis = new ArrayList<>();
        // int n= nums.length;

        // for(int num : nums) {
        //     set.add(num);
        // }

        // for(int i=1;i<=n;i++){
        //     if(!set.contains(i)){
        //         lis.add(i);
        //     }
        // }
        // return lis;
    }
}