class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] c = new int[101];

        for(int i=0;i<logs.length;i++){
            c[logs[i][0]-1950]++;
            c[logs[i][1]-1950]--;
        }

        int pop=0;
        int maxpop=0;
        int ans=0;

        for(int i=0;i<101;i++){
            pop+=c[i];

            if(pop>maxpop){
                maxpop=pop;
                ans=i+1950;
            }
        }
        return ans;
        
    }
}