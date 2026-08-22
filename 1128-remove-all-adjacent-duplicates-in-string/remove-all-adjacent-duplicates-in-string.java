class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==t) {
                stack.pop();
                sb.deleteCharAt(sb.length()-1);
            } else{
            stack.push(t);
            sb.append(t);
            }
        }
        return new String(sb);
    }
}