class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=n;

        int sum=0;

        for(int k=0;k<n;k++){
            sum+=mat[k][k];
        }

        for(int i=0;i<n;i++){
                if(i==n-1-i) continue;
                sum+=mat[i][n-1-i];
            }

    return sum;
        
    }
}