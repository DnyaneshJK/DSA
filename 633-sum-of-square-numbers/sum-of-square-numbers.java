class Solution {
    public boolean judgeSquareSum(int c) {
        long n = (long) Math.sqrt(c);
        HashSet<Long> set = new HashSet<>();

        for(long i=0;i<=n;i++){
            set.add(i*i);
        }

        for(long i=0;i<=n;i++){
            long sq = c-(i*i);
            if(set.contains(sq)) return true;
            
        }

        return false;
        
    }
}