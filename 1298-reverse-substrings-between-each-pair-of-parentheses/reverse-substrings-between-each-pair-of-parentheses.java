class Solution {
    public String reverseParentheses(String s) {
        Deque<String> stack  = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if(s.charAt(i)==')'){
               sb.reverse();
               String st = stack.pop();
               sb = new StringBuilder(st+sb.toString());
            }
            else{
            sb.append(s.charAt(i));
            }
                
        }

        return sb.toString();
    }
}