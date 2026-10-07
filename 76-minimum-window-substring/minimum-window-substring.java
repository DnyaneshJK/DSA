class Solution {
    public String minWindow(String s, String t) {

        int l=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        String ans = "";

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int r=0;r<s.length();r++){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))-1);
                if(map.get(s.charAt(r))>=0){
                count++;
                }
            }
            while(count==t.length()){
                if(min>r-l+1){
                    min=r-l+1;
                    ans = s.substring(l,r+1);
                }
                if(map.containsKey(s.charAt(l))){
                map.put(s.charAt(l),map.get(s.charAt(l))+1);
                if(map.get(s.charAt(l))>0){
                count--;
                }
                }
                l++;
            }
        }
      return ans;
    }
}