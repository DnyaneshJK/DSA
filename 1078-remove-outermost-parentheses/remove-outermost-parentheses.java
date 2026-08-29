class Solution {
    public String removeOuterParentheses(String s) {
        int i=0;
        int c=0;
        int c1=0;
        StringBuilder s1 = new StringBuilder();
        for(int j=0;j<s.length();j++){
            if(s.charAt(j) =='('){
                c++;
            } else{
                c1++;
            }

            if(c==c1){
                s1.append(s.substring(i+1,j));
                i=j+1;
            }
        }
            return s1.toString();
    }
}