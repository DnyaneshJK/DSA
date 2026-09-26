class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int c=0;
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }

        for(String st : words){
            char[] ch = st.toCharArray();
            c++;
            for(int i=0;i<ch.length;i++){
                if(!set.contains(ch[i])){
                    c--;
                    break;
                }
            }
        }

        return c;

    }
}