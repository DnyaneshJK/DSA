class Solution {
    public long countCommas(long n) {
       long ans=0;
       long s = 1000;

       while(s<=n){
            ans += n-s+1;
            s*=1000;
       }
       return ans;
    }
}