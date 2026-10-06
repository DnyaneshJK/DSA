class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc==color) return image;
        dfs(sr,sc,image,color,oc);
        return image;
    }

    public void dfs( int sr, int sc,int[][] image,int color,int oc){
        
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=oc){
            return;
        }
        image[sr][sc] = color;
        dfs(sr+1,sc,image,color,oc);
        dfs(sr-1,sc,image,color,oc);
        dfs(sr,sc+1,image,color,oc);
        dfs(sr,sc-1,image,color,oc);
    }
}