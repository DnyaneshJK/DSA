class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String s : arr){
            if(s.length()<3){
                sb.append(s.toLowerCase());
                sb.append(" ");
            } else{
               sb.append(Character.toUpperCase(s.charAt(0)));
                for(int i=1;i<s.length();i++){
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}