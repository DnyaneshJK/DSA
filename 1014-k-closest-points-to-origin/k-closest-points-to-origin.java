class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        int[][] ans = new int[k][2];
        for(int[] dir : points){
            int x1 = dir[0];
            int y1 = dir[1];
            int dist = (x1*x1)+(y1*y1);
            pq.offer(new int[]{dist,x1,y1});
        }

        for(int i=0;i<k;i++){
            int[] a = pq.poll();
            int b = a[1];
            int c = a[2];
            ans[i][0]=b;
            ans[i][1]=c;
        }
        return ans;
    }
}