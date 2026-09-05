class Solution {
    public String smallestSubsequence(String s) {
        Deque<Character> st = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.contains(c)) continue;
            while(!st.isEmpty() && c < st.peek() && s.indexOf(st.peek(),i+1)!=-1 ){
                st.pop();
            }
            st.push(c);
        }
        while(!st.isEmpty()){
            sb.append(st.removeLast());
        }

        return sb.toString();
    }
}