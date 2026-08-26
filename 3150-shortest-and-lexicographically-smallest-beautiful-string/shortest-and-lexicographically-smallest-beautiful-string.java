class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int c = 0;
        String ans = "";
        int i = 0;
        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == '1')
                c++;

            if (c == k) {
                while (s.charAt(i) == '0') {
                    i++;
                }

                String can = s.substring(i, j + 1);

                if (ans.equals("") || ans.length() > can.length()
                        || (can.length() == ans.length() && can.compareTo(ans) < 0)) {
                    ans = can;
                }
                i++;
                c--;
                 
            }
           

        }


        return ans;

    }
}