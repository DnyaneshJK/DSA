class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d =new ArrayDeque<>();
        int[] ans = new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){

            while(!d.isEmpty() && d.peekFirst() < i-k+1){
                d.pollFirst();
            }

            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.pollLast();
            }

            d.addLast(i);

            if(i>=k-1){
                ans[i-k+1] = nums[d.peekFirst()]; 
            }
        }
        
        return ans;

        
    }
}



        // int max = Integer.MIN_VALUE;
        // int[] ans = new int[nums.length-k+1];
        
        // for(int i=0;i<=nums.length-k;i++){
        //     int[] sa = Arrays.copyOfRange(nums,i,i+k);
        //     Arrays.sort(sa);
        //     ans[i] = sa[k-1];
        // }

        //     return ans;