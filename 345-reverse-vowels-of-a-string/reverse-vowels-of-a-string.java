class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        while(i<j){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1 && "aeiouAEIOU".indexOf(s.charAt(j))!=-1){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }

            if("aeiouAEIOU".indexOf(s.charAt(i))==-1){
                i++;
            } 

            if("aeiouAEIOU".indexOf(s.charAt(j))==-1){
                j--;
            }
        }

        for(char a : c){
            sb.append(a);
        }

        return sb.toString();
        
    }
}