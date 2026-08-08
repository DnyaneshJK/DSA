class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int maxfreq = 0;
        int left=0;
        int answer = 0;
        
        for(int right=0;right<s.length();right++){

            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxfreq = Math.max(maxfreq,freq[ch - 'A']);
            int size = right-left+1;
            int a = size - maxfreq;

            if(a>k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            answer = Math.max(answer,right-left+1);

        }
        return answer;
    }
}