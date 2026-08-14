class Solution {
    public int maximumLengthSubstring(String s) {

        int n=s.length();
        int max=0;
        int l=0;
        int r=0;

        int[] freq = new int[26];

        while(r<n){
            char ch = s.charAt(r);
            freq[ch - 'a']++;

            while(freq[ch - 'a']>2){
                char c = s.charAt(l);
                freq[c - 'a']--;
                l++;
            }

            max = Math.max(max,r-l+1);
            r++;

        }
       return max;
        
    }
}