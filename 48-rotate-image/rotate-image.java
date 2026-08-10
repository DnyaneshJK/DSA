class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            reverse(matrix[i],0,n-1);
        }


        
    }

    public static void reverse(int[] mat,int l,int r){
        while(l<r){
            int temp=mat[l];
            mat[l]=mat[r];
            mat[r]=temp;
            l++;
            r--;
        }
    }
}