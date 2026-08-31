class Solution {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int smax = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){

            while(!stack.isEmpty() && nums[i]>stack.peek()){
                smax = Math.max(smax,stack.pop());
            }

            if(nums[i] < smax){
                return true;
            }

            stack.push(nums[i]);
        }
        return false;
    }
}