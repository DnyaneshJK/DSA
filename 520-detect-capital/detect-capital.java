class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        char[] arr = word.toCharArray();
        for(char c : arr){
            if((int) c < 97) cap++;
        }

        if(cap==word.length() || cap==0 || cap==1 && arr[0]<97){
            return true;
        }
            return false;
    }
}