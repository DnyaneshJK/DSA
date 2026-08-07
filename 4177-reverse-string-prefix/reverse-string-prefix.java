class Solution {
    public String reversePrefix(String s, int k) {

        String sub = s.substring(0,k);
        char[] arr = sub.toCharArray();
        int l=0;
        int r=k-1;
        int len = s.length();

        while(l<r){
            char temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        
        String n = new String(arr);
        String ans = n + s.substring(k,len);
        return ans;
    }
}