class Solution {
    public boolean checkDivisibility(int n) {
        String s = String.valueOf(n);
        boolean a =  true;
        int sum=0;
        int prod = 1;

        for(int i=0;i<s.length();i++){
            int n1 = s.charAt(i) - '0';
            sum+=n1;
            prod*=n1;
        }

        int ans = sum+prod;

        if(n%ans!=0) a= false;
        
        return a;
    }
}