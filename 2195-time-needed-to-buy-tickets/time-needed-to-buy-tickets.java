class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int c=0;
        while(tickets[k]!=0){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]==0) continue;
                tickets[i]-=1;
                c++;

                if(i==k && tickets[i]==0){
                    return c;
                }
            }
        }
        return c;
    }
}