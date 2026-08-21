class Solution {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
             if(!stack.isEmpty() && Math.abs(t - stack.peek()) == 32){
                sb.deleteCharAt(sb.length()-1);
                stack.pop();
            } else{
            sb.append(t);
            stack.push(t);
            }
        }

        return new String(sb);
        
    }
}