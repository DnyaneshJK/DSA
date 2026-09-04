class Solution {
    public String removeDuplicateLetters(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.contains(c))
                continue;
            while (!stack.isEmpty() && c < stack.peek() && s.indexOf(stack.peek(), i + 1) != -1) {
                stack.pop();
            }

            stack.push(c);

        }

        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }

        return sb.toString();

    }
}