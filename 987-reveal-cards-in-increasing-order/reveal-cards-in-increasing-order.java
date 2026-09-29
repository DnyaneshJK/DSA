class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> q = new ArrayDeque<>();
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            q.offer(i);
        }

        Arrays.sort(deck);
        int a=0;
        int c=n;
        while(c>0){
            int index = q.poll();
            ans[index] = deck[a++]; 
            if(!q.isEmpty()){
            int b = q.poll();
            q.offer(b);
            }
            c--;
        }

        return ans;
    }
}