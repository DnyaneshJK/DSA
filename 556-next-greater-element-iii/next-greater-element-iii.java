class Solution {
    public int nextGreaterElement(int n) {
        char arr[] = String.valueOf(n).toCharArray();
        int s = arr.length;
        int j=0;
        int i=0;
        for(j=s-2;j>=0;j--){
            if(arr[j]<arr[j+1]) break;
        }
        if(j==-1) return -1;

        for(i=s-1;i>=0;i--){
            if(arr[i]>arr[j]) break;
        }

        char temp = arr[j];
        arr[j] =arr[i];
        arr[i] = temp;

        int l=j+1;
        int r=s-1;

        while(l<r){
        char temp1 = arr[l];
        arr[l] =arr[r];
        arr[r] = temp1;
        l++;
        r--;
        }
     long ans = Long.parseLong(new String(arr));        

        if (ans > Integer.MAX_VALUE) {
            return -1;
             }   

        return (int) ans;
    }
}