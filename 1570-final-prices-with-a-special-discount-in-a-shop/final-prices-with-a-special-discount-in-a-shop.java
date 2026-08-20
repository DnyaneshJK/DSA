class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> s = new ArrayDeque<>();
        int n=prices.length;
        int[] ans  = new int[n];

        for(int i=n-1;i>=0;i--){

            while(!s.isEmpty() && s.peek()>prices[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=prices[i];
            } else{
                ans[i]=prices[i]-s.peek();
            }
            s.push(prices[i]);
        }
        return ans;
    }
}