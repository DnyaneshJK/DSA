class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        int n = sentence.length();

        if(n<26) return false;

        for(int i=0;i<n;i++){
            int a = sentence.charAt(i)-'a';
            if(arr[a]!=true){
                arr[a] = true;
            }
        }

        for(int i=0;i<26;i++){
            if(arr[i]==false) return false;
        }

        return true;
    }
}