class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ps = new int[arr.length];
        int[] ans = new int[queries.length];
        ps[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i] = ps[i-1]^arr[i];
        }

        for(int i=0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];

            if(l==0){
                ans[i] = ps[r];
            } else{
                ans[i] = arr[l]^ps[r]^ps[l];
            }   
        }
            return ans;
    }
}