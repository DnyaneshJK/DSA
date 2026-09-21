class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int c =s.charAt(i);
            c=26-(c-'a');
            ans+=(i+1)*c;
        }
        return ans;
    }
}