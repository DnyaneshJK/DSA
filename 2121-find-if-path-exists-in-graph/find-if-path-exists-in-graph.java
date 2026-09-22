class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
           }
            for(int e[] : edges){
                int u = e[0];
                int v = e[1];
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            Queue<Integer> q = new ArrayDeque<>();
            q.offer(source);

            boolean[] visited = new boolean[n];
            visited[source]=true;

            while(!q.isEmpty()){
                int node = q.poll();

                if(node==destination){
                    return true;
                }

                for(int n1 : graph.get(node)){

                    if(!visited[n1]){
                        visited[n1]=true;
                        q.offer(n1);
                    }
                }
            }
            return false;
    }
}