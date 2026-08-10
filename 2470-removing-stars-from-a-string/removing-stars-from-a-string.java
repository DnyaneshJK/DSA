class Solution {
    public String removeStars(String s) {
        StringBuilder arr = new StringBuilder();
        for(char c : s.toCharArray()){
            arr.append(c);
        }

        int i=0;
        for(int j=0;j<arr.length();j++){
            
            if(arr.charAt(j) == '*'){
                i=j-1;
                arr.deleteCharAt(j);
                arr.deleteCharAt(i);
                j-=2;
            }
        }
        return arr.toString();
    }
}