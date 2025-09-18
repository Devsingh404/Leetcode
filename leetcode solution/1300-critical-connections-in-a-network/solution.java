class Solution {
    private int timer = 1;
    public void dfs(int node , int parent , List<List<Integer>> adj ,
    int[] vis , int[] timeIn , int[] low , List<List<Integer>> answer){
        vis[node] = 1;
        timeIn[node] = low[node] = timer;
        timer++;
        
        for(int it : adj.get(node)){
            
            if(it == parent) continue;
            
            if(vis[it]==0){
                
                dfs(it , node , adj , vis , timeIn , low , answer);
                low[node] = Math.min(low[it] , low[node]);
                if(low[it] > timeIn[node]){
                    List<Integer> temp = new ArrayList<>();
                    if (node < it) {
                        temp.add(node);
                        temp.add(it);
                    } else {
                        temp.add(it);
                        temp.add(node);
                    }
                    answer.add(temp);
                }
            }else{
                low[node] = Math.min(low[it] , low[node]);
            }
        }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (List<Integer> edge : connections) {
            int u = edge.get(0);
            int v = edge.get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] vis = new int[n];
        int[] timeIn = new int[n];
        int[] low = new int[n];
        
        List<List<Integer>> answer = new ArrayList<>();
        
        dfs( 0 , -1 , adj , vis , timeIn , low , answer);
        answer.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0))) return a.get(0) - b.get(0);
            return a.get(1) - b.get(1);
        });
        
        return answer;
    }
}
