class Solution {
    public int singleNumber(int[] nums) {

        int ans=0;

        for(int n : nums){
            ans = ans^n;
        }

        return ans;
        // HashMap<Integer,Integer> map  = new HashMap<>();
        // int ans=0;
         
        //  for(int num : nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        //  }

        //  for(int n : map.keySet()){
        //     if(map.get(n)==1){
        //         ans=n;
        //     }
        //  }
        // return ans;
    }
}