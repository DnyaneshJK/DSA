class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=2*n-1;i>=0;i--){

            int t=i%n;

            while(!stack.isEmpty() && nums[t]>=stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[t] = -1;
            } else{
                ans[t] = stack.peek();
            }

            stack.push(nums[t]);
        }
        return ans;
    }
}