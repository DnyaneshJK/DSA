class Solution {
    public String reverseWords(String s) {
        String[] st = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            if(st[i]=="") continue;
            sb.append(st[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}