class Solution {
    public String reverseStr(String s, int k) {

        int n=s.length();
        char[] arr = s.toCharArray(); 
        
        for(int i=0;i<arr.length;i+=k*2){
            int l = i;
            int r = Math.min(n-1,i+k-1);

            reverse(arr,l,r);
        }
        return new String(arr);
        
    }

    public static void reverse(char[] arr,int l,int r){
        while(l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}