class Solution {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] st = s.split(" ");

        for(String str : st){
            sb.append(new StringBuilder(str).reverse());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}