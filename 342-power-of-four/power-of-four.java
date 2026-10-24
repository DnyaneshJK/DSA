class Solution {
    public boolean isPowerOfFour(int n) {
        int count = 0;
        if(n<=0) return false;

        while((n&1)==0){
            n = n>>1;
            count++;
        }
        
        return n==1 && count%2==0;
    }
}