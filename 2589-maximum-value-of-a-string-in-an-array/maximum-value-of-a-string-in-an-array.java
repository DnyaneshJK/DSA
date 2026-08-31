class Solution {
    public int maximumValue(String[] strs) {
        
        int max=-1;
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            boolean n = true;
            for(int j=0;j<s.length();j++){
                if(!Character.isDigit(s.charAt(j)))
               {
                 n =false;
                break;
               }
            }

        if(n){
            max = Math.max(max,Integer.parseInt(s));
        } else{
            max = Math.max(max,s.length());
        } 
        }

    return max;
}}