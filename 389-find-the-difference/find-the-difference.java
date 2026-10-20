class Solution {
    public char findTheDifference(String s, String t) {
        int l = t.length();
        char ans = 'a';
        ArrayList<Character> set = new ArrayList<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }

        for(char ch : t.toCharArray()){
            if(set.contains(ch)){
                set.remove(Character.valueOf(ch));
            } else{
                return ch;
            }
        }

        return ' ';
        
    }
}