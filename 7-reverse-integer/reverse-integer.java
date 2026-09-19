class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        long num=x;
        if(x==0) return 0;
        if(num<0){
            num=-num;
            sb.append('-');
        }
        while(num>0){
            sb.append(num%10);
            num/=10;
        }
        long ans = Long.parseLong(sb.toString());
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        return (int) ans;
    }
}