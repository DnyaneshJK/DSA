class Solution {
    public String reverseParentheses(String s) {
        Deque<StringBuilder> stack  = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(sb);
                sb = new StringBuilder();
            }
            else if(s.charAt(i)==')'){
               sb.reverse();
               StringBuilder st = stack.pop();
               st.append(sb);
               sb = st;
            }
            else{
            sb.append(s.charAt(i));
            }
                
        }

        return sb.toString();
    }
}