class Solution {
    public String removeKdigits(String num, int k) {

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

       for(int i=0;i<num.length();i++){
         int n=num.charAt(i) -'0';
         while(!stack.isEmpty() && k>0 && n < stack.peek()){
            stack.pop();
            k--;   
        }
       stack.push(n);
       }

       while(k>0){
        stack.pop();
        k--;
       }
       
       while(!stack.isEmpty()){
        int n1 = stack.pop();
         sb.append(n1);
       }
        sb.reverse();

        int i=0;
        while(i< sb.length() && sb.charAt(i) == '0'){
            i++;
        }

        String ans = sb.substring(i);

        if (ans.length() == 0) {
            return "0";
        }

        return ans;
    }
}