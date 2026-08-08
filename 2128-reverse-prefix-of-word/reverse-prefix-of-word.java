class Solution {
    public String reversePrefix(String word, char ch) {

        int n = word.indexOf(ch);
        if(n==-1) return word;
        StringBuilder sb = new StringBuilder();
        char[] arr  =  word.toCharArray();
        String sub = word.substring(n+1,word.length());

        for(int i=n;i>=0;i--){
            sb.append(arr[i]);
        }

        return sb.toString()+sub;
        
        
    }
}